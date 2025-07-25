package ArrayLists;

import java.util.ArrayList;

public class Monotonic {
    public static boolean monotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1))
                inc = false;
            if(list.get(i) < list.get(i+1))
                 dec = false;
        }

        return inc || dec;
    }
    public static void main(String args[]){
      ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
     
      System.out.println(monotonic(list));
   }
}
