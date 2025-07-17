package LinkedList;
//Time complexity = O(n)
public class CreateLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public  int size;

    public void addFirst(int data){
        //step 1 : create new node 
        Node newNode = new Node(data);
        size++;
        //base case
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step 2: newNode
        newNode.next = head; //link
        //step 3 : head = newNode;
        head = newNode;
    }

    public void addLast(int data){
        //step 1 : create new node 
        Node newNode = new Node(data);
        size++;
        //base case
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2: 
        tail.next = newNode;
        //step 3:
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // public int removeFirst() {
    //     if(size == 0){
    //         System.out.println("LL is empty");
    //         return Integer.MIN_VALUE;
    //     }
    //     else if(size == 1){
    //         int val = head.data;
    //         head = tail = null;
    //         return val;
    //     }
    //     int val = head.data;
    //     head = head.next;
    //     return val;
    // }

    // public int removeLast() {
    //     if(size == 0){
    //         System.out.println("LL is empty");
    //         return Integer.MIN_VALUE;
    //     }
    //     else if(size == 1){
    //         int val = head.data;
    //         head = tail = null;
    //         size=0;
    //         return val;
    //     }
    //    Node prev = head;
    //    for(int i=0;i<size-2;i++){
    //     prev = prev.next;
    //    }
    //    int val = prev.next.data; // tail.data
    //    prev.next = null;
    //   tail = prev;
    //    size--;
    //    return val;
    // }

    //O(n) By using iteration method
    public int itrSearch(int key){
        Node temp = head;
        int idx = 0;

        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        //key not found 
        return -1;
    }

    // By using Recursive Search
    public int helper(Node head, int key){
         if(head == null){
            return -1;
         }
         if(head.data == key){
            return 0;
         }
         int idx = helper(head.next, key);
         if(idx == -1){
            return -1;
         }
         return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Remove the nth node from the end
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next; //remove first
            return;
        }

        //sz-n
        int i =1;
        int iTOFind = sz-n;
        Node prev = head;
        while(i < iTOFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    public void print(){
         //  Print to verify
    if(head == null){
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
    }




    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next;//+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;// right half head
        Node left = head;

        //step 3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

   public static void main(String args[]) {
    CreateLL ll = new CreateLL();  // create object of your custom linked list
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(2, 2);
    // ll.removeFirst();
    // ll.removeLast();
    
    ll.print();
   ll.reverse();
   ll.deleteNthFromEnd(2);
   ll.print();
   System.out.println(ll.checkPalindrome());


    System.out.println("Size is : "+ll.size);
    System.out.println("key is at index : "+ll.itrSearch(2));
     System.out.println("key is at index : "+ll.recSearch(2));
}

}

//op : 1 -> 2 -> 2 -> 3 -> 4 -> null
//      Size is : 5
//       key is at index : 1
