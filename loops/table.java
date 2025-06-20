package loops;
import java.util.*;
public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number :");
        int n = sc.nextInt();
        
        for(int i =1; i<= 10;i++){
           int  sum = n * i;
            System.out.println(n +" x " +i+ " = " +sum);
        }

        sc.close();
    }
}
