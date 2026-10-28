public class reverseALL {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        System.out.println("ORIGINAL LIST");
        LinkedListUtils.print(head);

        reverseALL rev = new reverseALL();
        head = rev.reverseList(head);

        System.out.println("REVERSED LIST");
        LinkedListUtils.print(head);
    }
}
