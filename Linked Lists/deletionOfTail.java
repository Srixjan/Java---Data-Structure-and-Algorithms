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
        LinkedListUtils.print(head);
 
        deletionOfTail del = new deletionOfTail();
 
        head = del.deleteTail(head);
 
        System.out.println("List after deleting tail: ");
        LinkedListUtils.print(head);
    }


}
