package BitManipulation;

import java.sql.Time;

// Divide two integers without using multiplication, division and mod operator
public class DivideNo {
    

    // public int getQ(int dividend, int divisor) {
    //     if (dividend == Integer.MIN_VALUE && divisor == -1) {
    //         return Integer.MAX_VALUE;
    //     }
    //     boolean negative = (dividend < 0) ^ (divisor < 0);
    //     int a = dividend > 0 ? -dividend : dividend;
    //     int b = divisor > 0 ? -divisor : divisor;
    //     int result = 0;

    //     while (a <= b) {
    //         int temp = b;
    //         int multiple = 1;

    //         // Find the largest shift
    //         while (a <= (temp << 1) && (temp << 1) < 0) {
    //             temp <<= 1;
    //             multiple <<= 1;
    //         }

    //         a -= temp;
    //         result += multiple;
    //     }

    //     return negative ? -result : result;

    // }


    public static void main(String args[]) {
        // System.out.println(getQ(5,2));
        int dividend = 22;
        int divisor = 3;
         long sum = 0;
         long ans = 0;
         //BAse Cases
        if(dividend == divisor) {
            System.out.println(1);
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1)  System.out.println(Integer.MAX_VALUE);
        if(divisor == 1) System.out.println(dividend);
  
         // Variable to store the sign of result
        boolean isPositive = true;
        
        // Updating the sign of quotient
        if(dividend >= 0 && divisor < 0) 
            isPositive = false;
        else if(dividend < 0 && divisor > 0)
            isPositive = false;

        // Storing absolute dividend & divisor
        long n = dividend;
        long d = divisor;

        n = Math.abs(n);
        d = Math.abs(d);

         /* Looping while sum added to divisor is
        less than or equal to divisor */
        while(sum + d <= n) {
            
            // Increment the count
           ans++;
           // Update the sum
           sum += d;
        }

        // Handling overflowing condition
        if(ans > Integer.MAX_VALUE && isPositive) 
            System.out.println(Integer.MAX_VALUE);
        if(ans > Integer.MAX_VALUE && !isPositive)
           System.out.println(Integer.MIN_VALUE);


         System.out.println(isPositive ? ans : -1*ans);
    }
// Time Complexity: O(dividend) 
}
