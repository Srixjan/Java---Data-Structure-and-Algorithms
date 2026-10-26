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
        LinkedListUtils.print(head);
        
        deletionOfHead delete = new deletionOfHead();
        
        head = delete.deleteHead(head);
 
        System.out.print("List after deleting head: ");
        LinkedListUtils.print(head);
    }
}
