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

    public static void main(String[] args) {
        int[] arr = {10, 30, 40};
        int X = 20, K = 2;
        ListNode head = LinkedListUtils.fromArray(arr);
 
        System.out.print("Original List: ");
        LinkedListUtils.print(head);

        insertionAtKthPostionInLL insertK = new insertionAtKthPostionInLL();
        head = insertK.insertAtKthPosition(head, X, K);
 
        System.out.print("List after inserting the given value at the Kth position: ");
        LinkedListUtils.print(head);
    }
}
