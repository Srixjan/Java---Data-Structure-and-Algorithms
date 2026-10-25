class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}

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

    private static ListNode arrayToLinkedList(int[] nums) {
        if (nums.length == 0) return null;

        ListNode head = new ListNode(nums[0]);
        ListNode prev = head;

        for (int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    private static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        ListNode head = arrayToLinkedList(nums);

        System.out.print("Original List: ");
        printLL(head);

        deleteKthElementDLL del = new deleteKthElementDLL();
        head = del.deleteKthElement(head, k);

        System.out.print("Modified list: ");
        printLL(head);
    }
}
