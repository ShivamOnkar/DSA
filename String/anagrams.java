package String;
import java.util.*;
public class anagrams {
    public static void main(String args[]){
        String s1 = "earth";
        String s2 = "heart";

        //convert in the lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //if length are same or not 
        if(s1.length() == s2.length()){
            //convert strings into char array
            char s1CharArray[] = s1.toCharArray();
            char s2CharArray[] = s2.toCharArray();

            //sort the char array
            Arrays.sort(s1CharArray);
            Arrays.sort(s2CharArray);

            //if the sorted char arrays are same 
            boolean result = Arrays.equals(s1CharArray,s2CharArray);
            if(result){
                System.out.println(s1+" and "+s2 + " are anagrams of each other.");
            }
            else{
                System.out.println(s1+" and "+s2 + " are not anagrams of each other.");
            }

        }
        else{
             System.out.println(s1+" and "+s2 + " are not anagrams of each other.");

        }
    }
}
