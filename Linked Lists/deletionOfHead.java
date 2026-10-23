class ListNode {
    int data;
    ListNode next;

    ListNode() {
        this.data = 0;
        this.next = null;
    }

    ListNode(int x) {
        this.data = x;
        this.next = null;
    }

    ListNode(int x, ListNode next) {
        this.data = x;
        this.next = next;
    }
}
public class deletionOfHead {
    public ListNode deleteHead(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp = null;
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

    public static ListNode insertAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    public static void main(String[] args) {
        ListNode head = null;
        head = insertAtHead(head, 3);
        head = insertAtHead(head, 2);
        head = insertAtHead(head, 1);
 
        System.out.print("Original list: ");
        printList(head);
        
        deletionOfHead delete = new deletionOfHead();
        
        head = delete.deleteHead(head);
 
        System.out.print("List after deleting head: ");
        printList(head);
    }
}
