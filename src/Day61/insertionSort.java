package Day61;

public class insertionSort {
    static void insert(int arr[],int i){
        // Your code here
        insertionSort(arr,i);
    }
    //Function to sort the array using insertion sort algorithm.
    public  static void insertionSort(int arr[], int n){
        //code here

        for (int i = 1; i < n; i++){
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > temp; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
