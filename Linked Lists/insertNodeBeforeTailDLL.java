public class insertNodeBeforeTailDLL {
    public ListNode insertBeforeTail(ListNode head, int X) {
        if (head == null) {
            return new ListNode(X);
        }
        if(head.next == null) {
            ListNode newHead = new ListNode(X, null, head);
            head.prev = newHead;
            return newHead;
        }
        ListNode tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        ListNode prev = tail.prev;
        ListNode newNode = new ListNode(X, prev, tail);
        prev.next = newNode;
        tail.prev = newNode;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        ListNode head = LinkedListUtils.fromArrayDLL(nums);

        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        insertNodeBeforeTailDLL tail = new insertNodeBeforeTailDLL();
        head = tail.insertBeforeTail(head, 1);

        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
