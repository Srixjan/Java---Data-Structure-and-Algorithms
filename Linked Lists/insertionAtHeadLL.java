class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class insertionAtHeadLL {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode nnode = new ListNode(X);
        nnode.next = head;
        head = nnode;
        return head;
    }

    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        int X= 10;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
 
        System.out.print("Original List: ");
        printLL(head);

        insertionAtHeadLL insertHead = new insertionAtHeadLL();
        head = insertHead.insertAtHead(head, X);
 
        System.out.print("List after inserting the given value at head: ");
        printLL(head);
    }
}
