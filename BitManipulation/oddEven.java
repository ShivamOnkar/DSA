package BitManipulation;

public class oddEven {
    //check the number is even or odd
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    //Get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //set ith bit 
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    //clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    //clear last i bits
    public static int clearIBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    //clear range of bits
    public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    //check if a number is power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String args[]){
        oddOrEven(3);    //op : Odd number
        oddOrEven(14);    //op: Even number
        System.out.println(getIthBit(10, 2));  //op: 0
        System.out.println(setIthBit(10, 2));  //op: 14
        System.out.println(clearIthBit(10, 1));   //op: 8
        System.out.println(clearIBit(15, 2));    //op: 12  n=1111 -> 1100
        System.out.println(clearBitsinRange(10, 2, 4));  //op: 2
        System.out.println(isPowerOfTwo(15));  //op: false
    }
}
