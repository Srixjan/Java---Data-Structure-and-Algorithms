public class lengthOfLinkedList {
    public static int lengthOfLinkedList(ListNode head) {
        int length = 0;
        ListNode current = head;
        
        while (current != null) {
            length++;
            current = current.next;
        }
        
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        ListNode head = LinkedListUtils.fromArray(arr);

        LinkedListUtils.print(head);

        int length = lengthOfLinkedList(head);
        System.out.println("Length of the linked list: " + length);
    }
}
