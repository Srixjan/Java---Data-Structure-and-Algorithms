import java.util.*;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class searchInLinkedList {
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static boolean searchElement(Node head, int target) {
        Node current = head;

        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printLinkedList(head);

        int target = 3;
        if (searchElement(head, target)) {
            System.out.println("Elements " + target + " found in the linked list.");
        } else {
            System.out.println("Element " + target + " not found in the linked list.");
        }
    }
}
