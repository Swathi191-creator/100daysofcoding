package Day29;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        System.out.println(sorting(arr));
    }
    public static int[] sorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
