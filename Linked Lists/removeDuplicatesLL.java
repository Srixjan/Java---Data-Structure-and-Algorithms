public class removeDuplicatesLL {
    public ListNode removeDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            ListNode nextNode = temp.next;
            while(nextNode != null && nextNode.data == temp.data) {
                ListNode duplicate = nextNode;
                nextNode = nextNode.next;
                duplicate = null;
            }

            temp.next = nextNode;
            // if (nextNode != null) {
            //     nextNode.prev = temp;  // add this part if u want to use dobly LL.
            // }

            temp = temp.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static ListNode newNode(int data) {
        return new ListNode(data);
    }

    public static void main(String[] args) {
        ListNode head = newNode(1);
        head.next = newNode(2);
        head.next.prev = head;
        head.next.next = newNode(2);
        head.next.next.prev = head.next;
        head.next.next.next = newNode(3);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = newNode(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = newNode(4);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = newNode(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        System.out.print("Original list: ");
        printList(head);

        removeDuplicatesLL rDupes = new removeDuplicatesLL();
        head = rDupes.removeDuplicates(head);

        System.out.print("Modified list: ");
        printList(head);
    }
}
