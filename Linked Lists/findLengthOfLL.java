public class findLengthOfLL {
    public int findLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtils.fromArray(new int[] {1, 2, 3, 4, 5});

        findLengthOfLL length = new findLengthOfLL(); 
        System.out.println(length.findLength(head));
    }
}