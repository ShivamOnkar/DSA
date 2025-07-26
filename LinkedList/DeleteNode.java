package LinkedList;
//  Delete N Nodes After M Nodes of a Linked List
//  We have a linked list and two integers M and N. Traverse the linked list such that you retain M
//  nodes then delete next N nodes, continue the same till end of the linked list. Difficulty Level:
//  Rookie.
//  Sample Input 1 : M=2 N=2    LL: 1->2->3->4->5->6->7->8
//  Sample Output 1 : 1->2->5->6
//  Sample Input 2 : M=3 N=2    LL: 1->2->3->4->5->6->7->8->9->10
//  Sample Output 2 : 1->2->3->6->7->8


    class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}


public class DeleteNode {
    public static Node deleteNAfterM(Node head, int M, int N) {
        Node current = head;

        while (current != null) {
            // Retain M nodes
            for (int i = 1; i < M && current != null; i++) {
                current = current.next;
            }

            // If we've reached the end, break
            if (current == null) break;

            // Start deletion from the next node
            Node temp = current.next;

            // Delete N nodes
            for (int i = 0; i < N && temp != null; i++) {
                temp = temp.next;
            }

            // Link M-th node to the (M+N+1)-th node
            current.next = temp;

            // Move to next retained part
            current = temp;
        }

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
        // Sample Input 1: 1->2->3->4->5->6->7->8
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next.next = new Node(8);

        System.out.print("Before: ");
        printList(head1);
        head1 = deleteNAfterM(head1, 2, 2);
        System.out.print("After : ");
        printList(head1);

        // Sample Input 2: 1->2->3->4->5->6->7->8->9->10
        Node head2 = new Node(1);
        Node curr = head2;
        for (int i = 2; i <= 10; i++) {
            curr.next = new Node(i);
            curr = curr.next;
        }

        System.out.print("\nBefore: ");
        printList(head2);
        head2 = deleteNAfterM(head2, 3, 2);
        System.out.print("After : ");
        printList(head2);
    }
}


// Output :
// Before: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
// After : 1 -> 2 -> 5 -> 6

// Before: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
// After : 1 -> 2 -> 3 -> 6 -> 7 -> 8