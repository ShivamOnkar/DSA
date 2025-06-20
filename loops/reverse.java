package loops;


public class reverse{
    public static void main(String[] args){
        int n = 78923456;

        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();
    } 
}