public class insertionAtTailLL {
    public ListNode insertAtTail(ListNode head, int X) {
        if (head == null) {
            return new ListNode(X);
        }

        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        ListNode NewNode = new ListNode(X);
        temp.next = NewNode;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int val = 40;
        ListNode head = LinkedListUtils.fromArray(arr);
 
        System.out.print("Original List: ");
        LinkedListUtils.print(head);
 
        insertionAtTailLL insertTail = new insertionAtTailLL();
        head = insertTail.insertAtTail(head, val);
 
        System.out.print("List after inserting the given value at the tail: ");
        LinkedListUtils.print(head);
    }
}
