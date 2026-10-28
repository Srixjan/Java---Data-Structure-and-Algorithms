import java.util.Arrays;
import java.util.List;

public class removeNthNodeFromBackOfTheList {
    public ListNode removeNthNode(ListNode head, int n) {
        ListNode fastp = head;
        ListNode slowp = head;

        for(int i = 0; i < n; i++) {
            fastp = fastp.next;
        }

        if (fastp == null) {
            return head.next;
        }

        while(fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        // ListNode delNode = slowp.next;
        slowp.next = slowp.next.next;
        return head;    
    } 

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7,  8, 9);
        int N = 3;

        ListNode head = new ListNode(arr.get(0));
        head.next = new ListNode(arr.get(1));
        head.next.next = new ListNode(arr.get(2));
        head.next.next.next = new ListNode(arr.get(3));
        head.next.next.next.next = new ListNode(arr.get(4));
        head.next.next.next.next.next = new ListNode(arr.get(5));
        head.next.next.next.next.next.next = new ListNode(arr.get(6));
        head.next.next.next.next.next.next.next = new ListNode(arr.get(7));
        head.next.next.next.next.next.next.next.next = new ListNode(arr.get(8));

        removeNthNodeFromBackOfTheList removeNth = new removeNthNodeFromBackOfTheList();
        head = removeNth.removeNthNode(head, N);
        LinkedListUtils.print(head);
    }
}
