package Arrays;
// import java.util.*;
public class largest {
    public static int getLargest(int numbers[]){
        int largests = Integer.MIN_VALUE; //-infinity
        int smallest  = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length;i++){
            if(largests < numbers[i]){
                largests = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is :" + smallest);
        return largests;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,6,5,3};
        System.out.println("Largest value is :" +getLargest(numbers));
    }
}
