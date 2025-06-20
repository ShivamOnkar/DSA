package Variable;
import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;

        System.out.println("Total bill is :" + bill);
        

        //Add on - with 18% tax 
        float Total = bill + (0.18f * bill);
        System.out.println("Bill with 18% tax : " + Total);
        sc.close();
    }
}
