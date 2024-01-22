package Day12;
import java.util.ArrayList;

public class sortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(0,8);
        arr.add(1,9);
        arr.add(2,4);
        arr.add(3,5);

        int k=3;
        int n=arr.size();
        System.out.println(search(arr,k,n));
    }
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        //       for(int i=0;i<n;i++){
        //       if(arr.get(i)==k){
        //           return i;
        //       }
        //   }
        //   return -1;

        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end-start)/2;
            if(arr.get(mid)==k){
                return mid;
            }

            if(arr.get(start)<=arr.get(mid)){
                if(arr.get(start)<=k && k<=arr.get(end)){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(mid<=k && k<=arr.get(end)){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }

        return -1;
    }
}
