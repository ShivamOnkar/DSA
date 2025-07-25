package ArrayLists; 
//Que : Container with most Water => for given n lines on x-axis, 
//       use 2 lines to form a container such that it holds Maximum water.

import java.util.ArrayList;

// #Flipkart 
public class Container {
    //  //Brute Force approach 
    //   //Time complexity = O(n^2)
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=0;j<height.size();j++){
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }
 
    // By 2 Pointer Approach
    //Time complexity= O(n)
    public static int storeWater(ArrayList<Integer> height){
            int maxWater = 0;
            int lp = 0;
            int rp  = height.size()-1;

            while(lp < rp){
                //calculate water area
                int ht = Math.min(height.get(lp),height.get(rp));
                int width = rp-lp;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);

                //update ptr
                if(height.get(lp) < height.get(rp)){
                    lp++;
                }else{
                    rp--;
                }
            }
            return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
