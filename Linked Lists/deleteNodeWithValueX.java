public class deleteNodeWithValueX {
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if (head == null) {
            return head;
        }
        if (head.data == X) {
            head = head.next;
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            if(temp.data == X) {
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        int X = 1;
        ListNode head = LinkedListUtils.fromArray(arr);
 
        System.out.print("Original List: ");
        LinkedListUtils.print(head);

        deleteNodeWithValueX delX = new deleteNodeWithValueX();
        head = delX.deleteNodeWithValueX(head, X);
 
        System.out.print("List after deleting the given value: ");
        LinkedListUtils.print(head);
    }
}
