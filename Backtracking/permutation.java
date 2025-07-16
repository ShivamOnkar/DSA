package Backtracking;
//Time complexity = O(n*n!)

public class permutation {
    public static void findPermutations(String str, String ans){
        //Base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //Recursion
        int n = str.length();
        for(int i=0;i<n;i++){
            char curr = str.charAt(i);
            //abcde = ab + de = abde
            String newStr = str.substring(0, i) + str.substring(i+1,n);
            findPermutations(newStr,ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "ABC";
        findPermutations(str,"");
    }
}


/* o/p:
ABC
ACB
BAC
BCA
CAB
CBA
 */