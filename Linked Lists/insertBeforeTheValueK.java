class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class insertBeforeTheValueK {
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if (head == null) {
            return null;
        }
        if(head.data == X) {
            return new ListNode(val, head);
        }

        ListNode temp = head;
        while(temp.next != null) {
            if(temp.next.data == X) {
                ListNode newNode = new ListNode(val, temp.next);
                temp.next = newNode;
                break;
            }
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
        int[] arr = {1, 2, 4, 5};
        int X = 4, val = 3;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
 
        System.out.print("Original List: ");
        printLL(head);
 
        insertBeforeTheValueK insertBeforeK = new insertBeforeTheValueK();
        head = insertBeforeK.insertBeforeX(head, X, val);
 
        System.out.print("List after inserting a new node before the given node: ");
        printLL(head);
    }
}
