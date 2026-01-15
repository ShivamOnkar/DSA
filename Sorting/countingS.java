package Sorting;
//Time complexity = O(n+range)

public class countingS {
    public static void countingSort(int arr[]){
          // 1. Find the maximum value
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

         // 2. Create count array
        int count[] = new int[largest+1];

        // 3. Count frequency of each element
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        
        // 4. Sort the array
        int j=0;
        for(int i=0; i<count.length; i++){     //des= for(int i=count.length-1;i>=0;i--)
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

     public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(arr);
        printArr(arr);
    }
}


// 1,4,1,3,2,4,3,7

// _0___1___2___3___4___5___6___7__
//  0 | 2 | 1 | 2 | 2 | 0 | 0 | 1 | 

// __0___1___2___3___4___5___6___7__
//   1 | 1 | 2 | 3 | 3 | 4 | 4 | 7 |

