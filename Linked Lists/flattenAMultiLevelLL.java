public class flattenAMultiLevelLL {
    static class ListNode {
        int val;
        ListNode next;
        ListNode child;

        ListNode() {
            val = 0;
            next = null;
            child = null;
        }

        ListNode(int data1) {
            val = data1;
            next = null;
            child = null;
        }

        ListNode(int data1, ListNode next1, ListNode next2) {
            val = data1;
            next = next1;
            child = next2;
        }
    }

    static class Solution {
        public ListNode flattenLinkedList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode mergedHead = flattenLinkedList(head.next);
            head = merge(head, mergedHead);
            return head;
        }

        private ListNode merge(ListNode list1, ListNode list2) {
            ListNode dummyNode = new ListNode(-1);
            ListNode res = dummyNode;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    res.child = list1;
                    res = list1;
                    list1 = list1.child;
                } else {
                    res.child = list2;
                    res = list2;
                    list2 = list2.child;
                }
                res.next = null;
            }

            if (list1 != null) {
                res.child = list1;
            } else {
                res.child = list2;
            }

            if (dummyNode.child != null) {
                dummyNode.child.next = null;
            }
            return dummyNode.child;
        }
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head.child = new ListNode(4);
        head.child.next = new ListNode(5);
        head.child.next.child = new ListNode(6);

        Solution solution = new Solution();
        ListNode result = solution.flattenLinkedList(head);
        printList(result);
    }
}
