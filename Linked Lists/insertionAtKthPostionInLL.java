class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

public class insertionAtKthPostionInLL {
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        if (head == null) {
            if(K == 1) {
                return new ListNode(X);
            }
            else {
                return head;
            }
        }
        if (K == 1) {
            return new ListNode(X, head);
        }

        int cnt = 0;
        ListNode temp = head;
        while(temp != null) {
            cnt++;
            if(cnt == K - 1) {
                ListNode newNode = new ListNode(X, temp.next);
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
        int[] arr = {10, 30, 40};
        int X = 20, K = 2;
        ListNode head = new ListNode(arr[0]);
        head.next = new ListNode(arr[1]);
        head.next.next = new ListNode(arr[2]);
 
        System.out.print("Original List: ");
        printLL(head);

        insertionAtKthPostionInLL insertK = new insertionAtKthPostionInLL();
        head = insertK.insertAtKthPosition(head, X, K);
 
        System.out.print("List after inserting the given value at the Kth position: ");
        printLL(head);
    }
}
