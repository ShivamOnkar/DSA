package Stack;
//The next greater element of some element x in an array
// is the first greater element that is to the right of x in the same array.
import java.util.*;
public class NextGreaterE {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--){             //for left change the loop from 0 to n
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){    //for next smallest change >= 
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
 
    }
}

// o/p : 8 -1 1 3 -1 