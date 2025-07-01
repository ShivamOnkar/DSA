package Backtracking;
//Time complexity = O(n*2^n)
//space complexity = O(n)

public class subString {
    public static void findSubStr(String str,  String ans, int i){
          if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //Yes
        findSubStr(str, ans+str.charAt(i), i+1);
         //No
        findSubStr(str,  ans,i+1);
            
    }
    public static void main(String args[]){
        String str = "abc";
        findSubStr(str,"",0);
    }
}

/* o/p:
abc
ab
ac
a
bc
b
c
NULL
 */