package Day14;

public class searchrotatedduplicates {
    public static void main(String[] args) {
        int[] arr={2,5,6,0,0,1,2};
        int key=0;
        System.out.println(searchInARotatedSortedArrayII(arr,key));
    }
    public static boolean searchInARotatedSortedArrayII(int []A, int key) {
        // Write your code here.
        //     for(int i=0;i<A.length;i++){
        //         if(A[i]==key){
        //             return true;
        //         }
        //     }
        //   return false;


        int start=0;
        int end=A.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(A[mid]==key){
                return true;
            }
            if(A[start]==A[mid]&&A[mid]==A[end]){
                start++;
                end--;
                continue;
            }
            if(A[start]<=A[mid]){
                if(A[start]<=key&&key<=A[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(A[mid]<=key&&key<=A[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
