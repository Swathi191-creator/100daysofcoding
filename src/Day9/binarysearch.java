package Day9;

public class binarysearch {
    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(arr,target));
    }
    static public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=start+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
