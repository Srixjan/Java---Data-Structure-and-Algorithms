import java.util.*;

class ListNode {
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class sortALinkedListOf1s2s3s {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);

        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;
        ListNode temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else if (temp.data == 2) {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        if (oneHead.next != null) {
            zero.next = oneHead.next;
        } else {
            zero.next = twoHead.next;
        }
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode newNode(int data) {
        return new ListNode(data);
    }

    public static void main(String[] args) {
        ListNode head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(0);
        head.next.next.next = newNode(1);
        head.next.next.next.next = newNode(2);
        head.next.next.next.next.next = newNode(0);
        head.next.next.next.next.next.next = newNode(1);

        System.out.print("Original list: ");
        printList(head);

        sortALinkedListOf1s2s3s sorter = new sortALinkedListOf1s2s3s();
        head = sorter.sortList(head);

        System.out.print("Sorted list: ");
        printList(head);
    }
}
