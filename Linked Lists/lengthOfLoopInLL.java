public class lengthOfLoopInLL {
    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findLength(slow, fast);
            }
        }
        return 0;
    }

    private int findLength(ListNode slow, ListNode fast) {
        int cnt = 1;

        fast = fast.next;

        while(slow != fast) {
            cnt++;
            fast = fast.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;

        lengthOfLoopInLL lengthLoop = new lengthOfLoopInLL();
        int loopLength = lengthLoop.findLengthOfLoop(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
