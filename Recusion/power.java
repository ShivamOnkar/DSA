package Recursion;

public class power {
    //Time complexity = O(n)
    public static int powerx(int x, int n){
        if(n== 0 ){
            return 1;
        }
        int xnm1 = powerx(x,n-1);
        int xn = x * xnm1;
        return xn;
    }

    //Time complexity = O(logn)
    public static int optimizedPow(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpow = optimizedPow(x, n/2);
        int  halfpowSqr = halfpow * halfpow;

        //n is odd
        if(n % 2 != 0){
            halfpowSqr = x * halfpowSqr;

        }
        return halfpowSqr;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        System.out.println(powerx(x, n));
        System.out.println(optimizedPow(x, n));

    }
}
