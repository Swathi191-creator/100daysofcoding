package Day61;

public class bubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }


        if(n==1){
            return;
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        bubbleSort(arr,n-1);

    }
}
