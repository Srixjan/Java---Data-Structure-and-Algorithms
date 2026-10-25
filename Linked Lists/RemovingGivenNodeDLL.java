class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;

    public ListNode() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public ListNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

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

    private static ListNode arrayToLinkedList(int[] nums) {
        if (nums.length == 0) return null;

        ListNode head = new ListNode(nums[0]);
        ListNode prev = head;

        for (int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i], prev, null);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        ListNode head = arrayToLinkedList(nums);
        ListNode node = head.next.next;

        System.out.print("Original List: ");
        printLL(head);

        RemovingGivenNodeDLL del = new RemovingGivenNodeDLL();
        del.deleteGivenNode(node);

        System.out.print("Modified list: ");
        printLL(head);
    }
}
