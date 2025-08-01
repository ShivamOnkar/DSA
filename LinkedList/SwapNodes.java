package LinkedList;
//  Swapping Nodes in a Linked List
//  We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
//  swapped by changing links. Swapping data of nodes may be expensive in many situations when
//  data contains many fields. It may be assumed that all keys in the linked list are distinct.
//  Sample Input 1 : 1->2->3->4,  x = 2, y = 4
//  Sample Output 1 : 1->4->3->2


class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class SwapNodes {

    public static Node swapNodes(Node head, int x, int y) {
        // If x and y are same, no need to swap
        if (x == y) return head;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, return original list
        if (currX == null || currY == null)
            return head;

        // If x is not head
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        // If y is not head
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    // Utility to print the list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Sample usage
    public static void main(String[] args) {
        // Input: 1->2->3->4, x = 2, y = 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Before swapping: ");
        printList(head);

        head = swapNodes(head, 2, 4);

        System.out.print("After swapping : ");
        printList(head);
    }
}

//Output :
// Before swapping: 1 -> 2 -> 3 -> 4
// After swapping : 1 -> 4 -> 3 -> 2