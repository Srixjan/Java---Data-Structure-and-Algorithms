import java.util.ArrayList;
import java.util.List;

public class TraversalInLinkedList {
    public List<Integer> LLTraversal(ListNode head) {
        ListNode temp = head;
        List<Integer> ans = new ArrayList<>();

        while(temp != null) {
            ans.add(temp.data);
            temp = temp.next;
        } 
        return ans;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtils.fromArray(new int[] {2, 5, 8, 7});

        TraversalInLinkedList traverse = new TraversalInLinkedList();

        List<Integer> result = traverse.LLTraversal(head);
 
        System.out.println("Linked List Values:");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
