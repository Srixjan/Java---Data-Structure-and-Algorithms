public class createLinkedList {
    public static void main(String[] args) {
        int[] values = {2, 5, 8, 7};
        ListNode head = LinkedListUtils.fromArray(values);
        LinkedListUtils.print(head);
    }
}
