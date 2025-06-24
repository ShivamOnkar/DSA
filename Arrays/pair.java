<<<<<<< HEAD
package Arrays;
//Time complexity is O(n^2)
public class pair {
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length;i++){
            int curr = numbers[i];
            for(int j= i+1; j<numbers.length;j++){
                System.out.print("(" + curr+"," + numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
=======
package Arrays;
//Time complexity is O(n^2)
public class pair {
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length;i++){
            int curr = numbers[i];
            for(int j= i+1; j<numbers.length;j++){
                System.out.print("(" + curr+"," + numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
>>>>>>> 2ed70a9902f3bf953b20f82399c81d632496623a
