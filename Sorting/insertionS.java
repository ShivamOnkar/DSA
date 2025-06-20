package Sorting;
//Time complexity = O(n^2)
public class insertionS {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > current) {      //des = arr[prev] < current
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = current;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSort(arr);
        printArr(arr);
    }
}
