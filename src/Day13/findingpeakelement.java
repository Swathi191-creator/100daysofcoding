package Day13;

public class findingpeakelement {
    public static void main(String[] args) {
        int[] arr={3,4,5,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        // int max=-1;
        // int peak_index=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //         peak_index=i;
        //     }
        // }
        // return peak_index;

        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]>=arr[mid-1]&&arr[mid]>=arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid+1]){
                mid=mid+1;
            }else{
                mid=mid-1;
            }
        }
        return arr[0];


        //optimized solution

//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] < arr[mid + 1]) {
//                start = mid + 1;
//            } else {
//                end = mid;
//            }
//        }
//
//
//        return start;

    }
}
