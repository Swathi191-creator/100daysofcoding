package Day76;

public class contigous {
    public  static void segregateElements(int arr[], int n){
        int[] ans = new int[n];
        int indx = 0;
        for(int i = 0; i< n; i++){
            if(arr[i]>=0){
                ans[indx] = arr[i];
                indx++;
            }
        }

        for(int i=0; i<n; i++){
            if((arr[i]<0)){
                ans[indx] = arr[i];
                indx++;
            }
        }

        for(int i=0; i<n; i++){
            arr[i] = ans[i];

        }
    }
}
