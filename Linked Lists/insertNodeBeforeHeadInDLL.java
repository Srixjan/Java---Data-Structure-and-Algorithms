public class insertNodeBeforeHeadInDLL {
    public ListNode insertBeforeHead(ListNode head, int data) {
        ListNode newHead = new ListNode(data, null, head);
        if (head != null) {
            head.prev = newHead;
        }
        return newHead;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        ListNode head = LinkedListUtils.fromArray(nums);

        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        insertNodeBeforeHeadInDLL solution = new insertNodeBeforeHeadInDLL();
        head = solution.insertBeforeHead(head, 1);

        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
