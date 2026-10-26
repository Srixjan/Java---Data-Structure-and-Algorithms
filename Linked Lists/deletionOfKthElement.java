public class deletionOfKthElement {
    public ListNode deleteKthNode(ListNode head, int k) {
       if (head == null) 
        return null;
       

       if (k == 1) {
        ListNode temp = head;
        head = head.next;
        return head;
       }
       ListNode temp = head;
       for (int i = 0; temp != null && i < k - 2; i++) {
        temp = temp.next;
       }

       if (temp == null || temp.next == null) {
        return head;
       }

       ListNode next = temp.next.next;
       temp.next = next;

       return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 7};
 
        ListNode head = LinkedListUtils.fromArray(arr);
 
        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        deletionOfKthElement delK = new deletionOfKthElement();
 
        int k = 2;
        head = delK.deleteKthNode(head, k);
 
        System.out.print("List after deleting the kth node: ");
        LinkedListUtils.print(head);
    }
}
