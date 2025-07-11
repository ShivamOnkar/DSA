package patterns;

public class diamond {
    public static void pattern(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
             //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(4);
    }
}
