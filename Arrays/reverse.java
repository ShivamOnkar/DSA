<<<<<<< HEAD
package Arrays;
//Time complexity = O(n)
//Space complexity = O(1)
public class reverse {

    public static void reverseArr(int numbers[]){
        int first = 0, last = numbers.length-1;
 
        while(first <last){
            //swap
            int temp =numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        reverseArr(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
          System.out.println();
    }
}
=======
package Arrays;
//Time complexity = O(n)
//Space complexity = O(1)
public class reverse {

    public static void reverseArr(int numbers[]){
        int first = 0, last = numbers.length-1;
 
        while(first <last){
            //swap
            int temp =numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        reverseArr(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
          System.out.println();
    }
}
>>>>>>> 2ed70a9902f3bf953b20f82399c81d632496623a
