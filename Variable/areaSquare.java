package Variable;
import java.util.*;
public class areaSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side of the Square :");
        int side = sc.nextInt();

        int area = side*side;
        System.out.println("Area of the Square is :" + area);
        sc.close();
    }
}
