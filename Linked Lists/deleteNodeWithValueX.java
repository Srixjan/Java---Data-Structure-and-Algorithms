class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class deleteNodeWithValueX {
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if (head == null) {
            return head;
        }
        if (head.data == X) {
            head = head.next;
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            if(temp.data == X) {
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        int X = 1;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
 
        System.out.print("Original List: ");
        printLL(head);

        deleteNodeWithValueX delX = new deleteNodeWithValueX();
        head = delX.deleteNodeWithValueX(head, X);
 
        System.out.print("List after deleting the given value: ");
        printLL(head);
    }
}
