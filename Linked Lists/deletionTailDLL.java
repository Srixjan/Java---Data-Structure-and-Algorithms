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
 
        ListNode head = arrayToLinkedList(nums);
 
        System.out.print("Original List: ");
        printLL(head);

        deletionTailDLL del = new deletionTailDLL();
        head = del.deleteTail(head);
 
        System.out.print("Modified list: ");
        printLL(head);
    }
}
