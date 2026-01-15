package Recusion;
/* 
 * you are gib=ven a number, convert it into a String of english 
 * like "two zero" .
 * note: the digits of the number will only be in the
 * range 0-9 and the last digit of a no. cant be 0.
 */
public class Number {
    static String digit[] = {"zero", "one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigit(int number){
        if(number == 0){
            return;
        }

        int lastDigit = number % 10;
        printDigit(number/10);
        System.out.println(digit[lastDigit] + " ");
    }

    public static void main(String args[]){
        printDigit(12344);
        System.out.println();
    }
}
