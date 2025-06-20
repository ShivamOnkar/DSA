package loops;
import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int fact = 1;
        if(n == 0){
            System.out.println("Factorial is : 1");
        }else{
            for(int i= n; i>=1 ;i--){
                 fact = fact * i;
            }
             System.out.println("Factorial is :"+ fact);
        }
        sc.close();
    }
}
