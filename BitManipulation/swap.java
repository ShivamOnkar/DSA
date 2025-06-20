package BitManipulation;

public class swap {
    // swap two number without using third
    public static void main(String args[]) {
        // int a = 5;
        // int b = 10;

        // a = a + b; // a = 15
        // b = a - b; // b = 5
        // a = a - b; // a = 10

        // System.out.println("a = " + a + ", b = " + b);

        int a = 5;
        int b = 10;

        a = a ^ b; // 0101 ^ 1010 = 1111 (15)
        b = a ^ b;  // 1111 ^ 1010 = 0101 (5)
        a = a ^ b;  // 1111 ^ 0101 = 1010 (10)

        System.out.println("a = " + a + ", b = " + b);
    }
}



