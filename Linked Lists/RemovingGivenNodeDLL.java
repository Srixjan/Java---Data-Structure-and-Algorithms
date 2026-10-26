public class RemovingGivenNodeDLL {
    public void deleteGivenNode(ListNode node) {
        ListNode prev = node.prev;
        ListNode front = node.next;

        if (front == null) {
            prev.next = null;
            node.prev = null;
            return;
        }

        prev.next = front;
        front.prev = prev;

        node.next = null;
        node.prev = null;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        ListNode head = LinkedListUtils.fromArrayDLL(nums);
        ListNode node = head.next.next;

        System.out.print("Original List: ");
        LinkedListUtils.print(head);

        RemovingGivenNodeDLL del = new RemovingGivenNodeDLL();
        del.deleteGivenNode(node);

        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
