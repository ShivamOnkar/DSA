package patterns;

public class buttterfly {
    public static void pattern(int n){
        //1st half 
        for(int i=1; i<=n; i++){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]){
        pattern(4);
    }
}
