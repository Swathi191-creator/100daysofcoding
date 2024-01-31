package Day31;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
       int[] arr={8, 6, 2, 5, 1};
       selectionSort(arr);
    }
    public static void selectionSort(int[] arr) {

        int N = arr.length;

        for(int i = 0; i < N; i++){

            for(int j = i + 1; j < N ; j++){

                if(arr[j] < arr[i]){

                    int temp = arr[j];

                    arr[j] = arr[i];

                    arr[i] = temp;

                }

            }

        }

    }


}
