public class mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while(list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
 
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        
        System.out.print("First sorted linked list: ");
        LinkedListUtils.print(list1);
 
        System.out.print("Second sorted linked list: ");
        LinkedListUtils.print(list2);

        mergeTwoSortedLists mergeLists = new mergeTwoSortedLists();
        ListNode mergedList = mergeLists.mergeTwoLists(list1, list2);
 
        System.out.print("Merged sorted linked list: ");
        LinkedListUtils.print(mergedList);
    }
}
