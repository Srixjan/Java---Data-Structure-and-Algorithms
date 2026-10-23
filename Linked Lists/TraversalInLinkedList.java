import java.util.ArrayList;
import java.util.List;

class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}

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
        ListNode y1 = new ListNode(2);
        ListNode y2 = new ListNode(5);
        ListNode y3 = new ListNode(8);
        ListNode y4 = new ListNode(7);
 
        y1.next = y2;
        y2.next = y3;
        y3.next = y4;
 

        TraversalInLinkedList traverse = new TraversalInLinkedList();

        List<Integer> result = traverse.LLTraversal(y1);
 
        System.out.println("Linked List Values:");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
