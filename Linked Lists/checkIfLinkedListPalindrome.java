public class checkIfLinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverseLinkedList(slow.next);
        ListNode first = head;
        ListNode second = newHead;

        while(second != null) {
            if (first.data != second.data) {
                reverseLinkedList(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        reverseLinkedList(newHead);
        return true;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(1);

        System.out.print("Original Linked List: ");
        LinkedListUtils.print(head);

        checkIfLinkedListPalindrome pallindromLL = new checkIfLinkedListPalindrome();
        if (pallindromLL.isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
