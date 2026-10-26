public final class LinkedListUtils {
    private LinkedListUtils() {
    }

    public static ListNode fromArray(int[] values) {
        ListNode head = null;
        ListNode tail = null;

        for (int value : values) {
            ListNode node = new ListNode(value);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }

        return head;
    }

    public static ListNode fromArrayDLL(int[] values) {
        ListNode head = null;
        ListNode tail = null;

        for (int value : values) {
            ListNode node = new ListNode(value);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
        }

        return head;
    }

    public static void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
