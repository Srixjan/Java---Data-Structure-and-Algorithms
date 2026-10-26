public class searchInLL {
    public boolean searchKey(ListNode head, int key) {
        while(head != null) {
            if (head.data == key) {
                return true;
            }

            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtils.fromArray(new int[] {1, 3, 5});

        searchInLL search = new searchInLL();
        System.out.println(search.searchKey(head, 3)); // Output: true
    }
}
