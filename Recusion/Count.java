package Recusion;
/*
 * we are given a string S,we need to find the count
 *  of all contigunous String starting and ending with
 *  the same character
 */

public class Count {
        public static int countSubstrings(String s) {
        return countHelper(s, 0, 0);
    }

    private static int countHelper(String s, int start, int end) {
        int n = s.length();

        if (start == n) return 0;           // Base case: All positions checked
        if (end == n) {                     // If one substring (from 'start') has been fully explored
            return countHelper(s, start + 1, start + 1);
        }

        int count = (s.charAt(start) == s.charAt(end)) ? 1 : 0;

        return count + countHelper(s, start, end + 1);  // Keep expanding 'end'
    }

    public static void main(String[] args) {
        String s = "abcab";
        System.out.println("Count of substrings: " + countSubstrings(s));
    }
}

