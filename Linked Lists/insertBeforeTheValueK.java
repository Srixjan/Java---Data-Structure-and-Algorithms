public class insertBeforeTheValueK {
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if (head == null) {
            return null;
        }
        if(head.data == X) {
            return new ListNode(val, head);
        }

        ListNode temp = head;
        while(temp.next != null) {
            if(temp.next.data == X) {
                ListNode newNode = new ListNode(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int X = 4, val = 3;
        ListNode head = LinkedListUtils.fromArray(arr);
 
        System.out.print("Original List: ");
        LinkedListUtils.print(head);
 
        insertBeforeTheValueK insertBeforeK = new insertBeforeTheValueK();
        head = insertBeforeK.insertBeforeX(head, X, val);
 
        System.out.print("List after inserting a new node before the given node: ");
        LinkedListUtils.print(head);
    }
}
