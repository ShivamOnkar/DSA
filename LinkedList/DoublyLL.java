package LinkedList;

public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
 
         public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static  Node head;
    public static Node tail;
    public  int size;

    //add
    public void addFirst(int data){
         Node newNode = new Node(data);
         size++;
         if(head == null){
            head = tail= newNode;
            return;
         }

         newNode.next = head;
         head.prev = newNode;
         head = newNode;
    }

    //remove
    public int removeFirst(){
        if(head == null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }


    //reverse
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(dll.size);

        //dll.removeFirst();
        dll.reverse();
        dll.print();
        System.out.println(dll.size);
    }
}
