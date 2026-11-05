import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findPairsWithGivenSumInDLL {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        if (head == null || head.next == null) {
            return new ArrayList<>();
        }

        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        ListNode left = head;
        ListNode right = tail;
        List<List<Integer>> result = new ArrayList<>();

        while(left != null && right != null && left != right && left.prev != right) {
            int sum = left.data + right.data;

            if (sum == target) {
                result.add(Arrays.asList(left.data, right.data));
                left = left.next;
                right = right.prev;
            }

            else if (sum < target) {
                left = left.next;
            }

            else {
                right = right.prev;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2); head.next.prev = head;
        head.next.next = new ListNode(4); head.next.next.prev = head.next;
        head.next.next.next = new ListNode(5); head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new ListNode(6); head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new ListNode(8); head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new ListNode(9); head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
 
        findPairsWithGivenSumInDLL findPair = new findPairsWithGivenSumInDLL();
        System.out.println(findPair.findPairsWithGivenSum(head, 7));
    }
}
