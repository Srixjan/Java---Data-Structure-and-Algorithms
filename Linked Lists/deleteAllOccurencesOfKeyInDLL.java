public class deleteAllOccurencesOfKeyInDLL {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == target) {
                if (temp == head) {
                    head = head.next;
                }

                ListNode prevNode = temp.prev;
                ListNode nextNode = temp.next;

                if (prevNode != null) {
                    prevNode.next = nextNode;
                }

                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }

                temp = nextNode;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static ListNode newNode(int data) {
        return new ListNode(data);
    }
 
    public static void main(String[] args) {
        ListNode head = newNode(1);
        head.next = newNode(2);
        head.next.prev = head;
        head.next.next = newNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = newNode(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = newNode(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = newNode(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = newNode(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
 
        System.out.print("Original list: ");
        LinkedListUtils.print(head);

        deleteAllOccurencesOfKeyInDLL deleteKey = new deleteAllOccurencesOfKeyInDLL();
        head = deleteKey.deleteAllOccurrences(head, 2);
 
        System.out.print("Modified list: ");
        LinkedListUtils.print(head);
    }
}
