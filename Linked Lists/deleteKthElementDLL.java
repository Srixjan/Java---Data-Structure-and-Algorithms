public class deleteKthElementDLL {
    public ListNode deleteKthElement(ListNode head, int k) {
        if (head == null) 
            return null;
    
        int count = 0;
        ListNode kNode = head;

        while (kNode != null) {
            count++;
            if (count == k) break;
            kNode = kNode.next;
        }

        if (kNode == null) return head; 
        
        ListNode prev = kNode.prev;
        ListNode front = kNode.next;

        if (prev == null && front == null) {
            return null;
        }
        else if (prev == null) {
            head = front;
            front.prev = null;
        }
        else if (front == null) {
            prev.next = null;
        }
        else {
            prev.next = front;
            front.prev = prev;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        ListNode head = LinkedListUtils.fromArrayDLL(nums);

        System.out.print("Original List: ");
        LinkedListUtils.print(head);

        deleteKthElementDLL del = new deleteKthElementDLL();
        head = del.deleteKthElement(head, k);

        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
