class ListNode {
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class insertionAtTailLL {
    public ListNode insertAtTail(ListNode head, int X) {
        if (head == null) {
            return new ListNode(X);
        }

        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        ListNode NewNode = new ListNode(X);
        temp.next = NewNode;
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
        int[] arr = {10, 20, 30};
        int val = 40;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
 
        System.out.print("Original List: ");
        printLL(head);
 
        insertionAtTailLL insertTail = new insertionAtTailLL();
        head = insertTail.insertAtTail(head, val);
 
        System.out.print("List after inserting the given value at the tail: ");
        printLL(head);
    }
}
