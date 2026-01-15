package Arrays;

public class subArr {

    //for finding sub arrays
    public static void printSubArr(int numbers[]){
         int ts = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrys = " + ts);
    }

    //for finding the max sum of sub arrays 
    //Using Brute force algo
    //Time complexity = O(n^3)          very bad complexity
     public static void sumOfSubArr(int numbers[]){
         int currSum = 0;
         int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++){
                   currSum = currSum + numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    //Using Prefix array
    //Time complexity = O(n^2)
     public static void maxSubArrSum(int numbers[]){
         int currSum = 0;
         int maxSum = Integer.MIN_VALUE;
         int prefix[] = new int[numbers.length];

         prefix[0] = numbers[0];
         //calculate prefix array
         for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
         }

        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum=start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }


    // Using Kadane_s Algorithm
    //Time complexity = O(n)
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;

        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is :"+ms);
    }


    //Main function
    public static void main(String args[]){
        // int numbers[] = {2,4,6,8,10};
        //  printSubArr(numbers);
        // int numbers[] = {1,-2,6,-1,3};
        // // sumOfSubArr(numbers);
        // maxSubArrSum(numbers);
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}