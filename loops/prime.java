package loops;
import java.util.*;
public class prime {
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

          if(n==2){
            System.out.println("n is the prime number");

          }
          else{
            boolean isPrime = true;
            for(int i=2; i<=n-1;i++){   // i<=Math.sqrt(n); 
                if(n % i == 0){
                    isPrime=false;
                }
            }
            if(isPrime == true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
          }
          sc.close();
     }
    
}