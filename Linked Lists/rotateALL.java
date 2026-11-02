public class rotateALL {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        temp.next = head;
        k = k % 10;
        int end = (count - k);
        while((end--) > 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }

    public static void insertNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        return;
        }
        ListNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        insertNode(head, 2);
        insertNode(head, 3);
        insertNode(head, 4);
        insertNode(head, 5);
 
        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        int k = 2;
        rotateALL rotateR = new rotateALL();
        ListNode newHead = rotateR.rotateRight(head, k);
        System.out.print("After " + k + " iterations: ");
        LinkedListUtils.print(newHead);

    }

}
