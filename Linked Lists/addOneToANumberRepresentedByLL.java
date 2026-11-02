public class addOneToANumberRepresentedByLL {
    public ListNode addOne(ListNode head) {
        head = reverseList(head);
        ListNode current = head;
        int carry = 1;
        while(current != null) {
            int sum = current.data + carry;
            carry = sum / 10;
            current.data = sum % 10;
            if (carry == 0) {
                break;
            }

            if (current.next == null && carry != 0) {
                current.next = new ListNode(carry);
                break;
            }

            current = current.next;
        }

        head = reverseList(head);
        return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
 
        addOneToANumberRepresentedByLL addOneeeee = new addOneToANumberRepresentedByLL();
        head1 = addOneeeee.addOne(head1);
        System.out.print("Result after adding one: ");
        LinkedListUtils.print(head1);
    }
}
