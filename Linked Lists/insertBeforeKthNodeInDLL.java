public class insertBeforeKthNodeInDLL {
    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        if (K < 1) {
            return head;
        }
        if (K == 1) {
            ListNode newHead = new ListNode(X, null, head);
            if (head != null) {
                head.prev = newHead;
            }
            return newHead;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            if(count == K) {
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        ListNode prev  = temp.prev;
        ListNode newNode = new ListNode(X, prev, temp);
        prev.next = newNode;
        temp.prev = newNode;

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int value = 6;
        int k = 3;

        ListNode head = LinkedListUtils.fromArrayDLL(nums);

        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        insertBeforeKthNodeInDLL solution = new insertBeforeKthNodeInDLL();
        head = solution.insertBeforeKthPosition(head, value, k);

        System.out.print("Modified ljjjist: ");
        LinkedListUtils.print(head);
    }
}
