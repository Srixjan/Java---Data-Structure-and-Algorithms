public class insertBeforeGivenNodeDLL {
    public void insertBeforeGivenNode(ListNode node, int X) {
        ListNode prev = node.prev;

        ListNode newNode = new ListNode(X, prev, node);
        
        prev.next = newNode;
        node.prev = newNode;

        return;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int value = 6;

        ListNode head = LinkedListUtils.fromArrayDLL(nums);

        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        ListNode givenNode = head.next.next;
        insertBeforeGivenNodeDLL solution = new insertBeforeGivenNodeDLL();
        solution.insertBeforeGivenNode(givenNode, value);

        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
