public class deletionInDLL {
    public ListNode deleteHead(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
 
        ListNode head = LinkedListUtils.fromArrayDLL(nums);
 
        System.out.print("Original List: ");
        LinkedListUtils.print(head);

        deletionInDLL del = new deletionInDLL();
        head = del.deleteHead(head);
 
        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
