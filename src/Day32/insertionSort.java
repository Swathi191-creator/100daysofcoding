package Day32;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        int size = arr.length;
        insertionSort(arr, size);
    }

    public static void insertionSort(int[] arr, int size) {
        // Your code goes here
        if (size <= 0) {
            return;
        }

//        for (int i = 1; i < size; i++) {
//            int key = arr[i];
//            int j;
//            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
//                // arr[j + 1] = arr[j];
//
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//            }
//
//            // arr[j + 1] = key;
//        }


//        if (size <= 0) {
//            return;
//        }

//        for(int i=0;i<size-1;i++){
//            for(int j=i+1;j>0;j--){
//                if(arr[j]<arr[j-1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }


        if (size <= 0) {
            return;
        }

        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j;

            // Shift elements to the right until finding the correct position for the key
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }
    }
}
