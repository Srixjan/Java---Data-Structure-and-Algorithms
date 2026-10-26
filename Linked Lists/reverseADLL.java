public class reverseADLL {
    public ListNode reverseDLL(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head.next;
        head.next = head.prev;
        head.prev = temp;

        if (head.prev == null) {
            return head;
        }

        return reverseDLL(head.prev);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode head = LinkedListUtils.fromArrayDLL(nums);

        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        reverseADLL reverse = new reverseADLL();
        head = reverse.reverseDLL(head);

        System.out.print("Reversed list: ");
        LinkedListUtils.print(head);
    }
}
