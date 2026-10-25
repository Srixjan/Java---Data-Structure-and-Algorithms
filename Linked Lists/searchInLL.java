class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}

public class searchInLL {
    public boolean searchKey(ListNode head, int key) {
        while(head != null) {
            if (head.val == key) {
                return true;
            }

            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);

        searchInLL search = new searchInLL();
        System.out.println(search.searchKey(head, 3)); // Output: true
    }
}
