public class insertionAtHeadLL {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode nnode = new ListNode(X);
        nnode.next = head;
        head = nnode;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        int X= 10;
        ListNode head = LinkedListUtils.fromArray(arr);
 
        System.out.print("Original List: ");
        LinkedListUtils.print(head);

        insertionAtHeadLL insertHead = new insertionAtHeadLL();
        head = insertHead.insertAtHead(head, X);
 
        System.out.print("List after inserting the given value at head: ");
        LinkedListUtils.print(head);
    }
}
