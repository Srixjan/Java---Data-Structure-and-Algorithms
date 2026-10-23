class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class deletionOfTail {
    public ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static ListNode insertAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = insertAtHead(head, 3);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);
 
        System.out.println("Original list: ");
        printList(head);
 
        deletionOfTail del = new deletionOfTail();
 
        head = del.deleteTail(head);
 
        System.out.println("List after deleting tail: ");
        printList(head);
    }


}
