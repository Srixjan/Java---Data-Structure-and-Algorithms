public class convertArrayToLL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        ListNode head = LinkedListUtils.fromArray(arr);
        LinkedListUtils.print(head);
    }
}
