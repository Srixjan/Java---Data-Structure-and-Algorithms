public class deletionTailDLL {
    public ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;  
        }
        
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        
        ListNode newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;
        
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
 
        ListNode head = LinkedListUtils.fromArrayDLL(nums);
 
        System.out.print("Original List: ");
        LinkedListUtils.print(head);

        deletionTailDLL del = new deletionTailDLL();
        head = del.deleteTail(head);
 
        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
