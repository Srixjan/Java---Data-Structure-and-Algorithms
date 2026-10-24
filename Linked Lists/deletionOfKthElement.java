class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

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

    private static void printLL(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 7};
 
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
        head.next.next.next = new ListNode(arr[3]);
 
        System.out.print("Original list: ");
        printLL(head);

        deletionOfKthElement delK = new deletionOfKthElement();
 
        int k = 2;
        head = delK.deleteKthNode(head, k);
 
        System.out.print("List after deleting the kth node: ");
        printLL(head);
    }
}
