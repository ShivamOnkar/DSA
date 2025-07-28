package LinkedList;

//  Odd Even Linked List
//  We have a Linked List of integers, write a function to modify the linked list such that all even
//  numbers appear before all the odd numbers in the modified linked list. Also, keep the order of
//  even and odd numbers same.
//  Sample Input 1 : 8->12->10->5->4->1->6->NULL
//  Sample Output 1 : 8->12->10->4->6->5->1->NULL
//  Sample Input 2 : 1->3->5->7->NULL
//  Sample Output 2 : 1->3->5->7->NULL

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class EvenOdd {
      public static Node rearrangeEvenOdd(Node head) {
        if (head == null) return null;

        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;
        Node current = head;

        while (current != null) {
            int val = current.data;
            if (val % 2 == 0) {
                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            }
            current = current.next;
        }

        // If there are no even or no odd nodes, return head
        if (evenStart == null) return oddStart;
        if (oddStart == null) return evenStart;

        // Combine even and odd lists
        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
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

    // Test the function
    public static void main(String[] args) {
        // Sample Input 1: 8->12->10->5->4->1->6->NULL
        Node head1 = new Node(8);
        head1.next = new Node(12);
        head1.next.next = new Node(10);
        head1.next.next.next = new Node(5);
        head1.next.next.next.next = new Node(4);
        head1.next.next.next.next.next = new Node(1);
        head1.next.next.next.next.next.next = new Node(6);

        System.out.print("Before: ");
        printList(head1);
        head1 = rearrangeEvenOdd(head1);
        System.out.print("After : ");
        printList(head1);

        // Sample Input 2: 1->3->5->7->NULL
        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(5);
        head2.next.next.next = new Node(7);

        System.out.print("\nBefore: ");
        printList(head2);
        head2 = rearrangeEvenOdd(head2);
        System.out.print("After : ");
        printList(head2);
    }
}
// Output :
// Before: 8 -> 12 -> 10 -> 5 -> 4 -> 1 -> 6
// After : 8 -> 12 -> 10 -> 4 -> 6 -> 5 -> 1

// Before: 1 -> 3 -> 5 -> 7
// After : 1 -> 3 -> 5 -> 7