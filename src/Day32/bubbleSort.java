package Day32;

public class bubbleSort {
        public static void bubbleSort(int[] arr, int n) {
            //Your code goes here

            for(int i=0;i<n-1;i++){
                boolean find=false;
                for(int j=1;j<n;j++){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                        find=true;
                    }
                }
                if(find==false){
                    break;
                }
            }
        }
}
