class ListNode {
    int val;
    ListNode next;
 
    ListNode() {
        val = 0;
        next = null;
    }
 
    ListNode(int data1) {
        val = data1;
        next = null;
    }
 
    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class adding2NumbersInLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
        while((l1 != null || l2 != null) || carry != 0) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        adding2NumbersInLL add = new adding2NumbersInLL();
        ListNode result = add.addTwoNumbers(l1, l2);
 
        printList(result);
    }
}
