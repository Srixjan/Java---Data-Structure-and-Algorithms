public class searchInLinkedList {
    public static boolean searchElement(ListNode head, int target) {
        ListNode current = head;

        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = LinkedListUtils.fromArray(values);

        LinkedListUtils.print(head);

        int target = 3;
        if (searchElement(head, target)) {
            System.out.println("Elements " + target + " found in the linked list.");
        } else {
            System.out.println("Element " + target + " not found in the linked list.");
        }
    }
}
