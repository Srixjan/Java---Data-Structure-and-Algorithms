public class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;

    public ListNode() {
        this(0);
    }

    public ListNode(int data) {
        this(data, null, null);
    }

    public ListNode(int data, ListNode next) {
        this(data, null, next);
    }

    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
