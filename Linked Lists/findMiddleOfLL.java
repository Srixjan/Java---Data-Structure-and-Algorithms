public class findMiddleOfLL {
    public ListNode middleLinkedList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

        findMiddleOfLL findM = new findMiddleOfLL();
        ListNode middle = findM.middleLinkedList(head);
        LinkedListUtils.print(head);
        System.out.println(middle.data);
    }
}
