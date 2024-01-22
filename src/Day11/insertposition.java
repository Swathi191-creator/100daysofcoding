package Day11;

import java.util.Arrays;

public class insertposition {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5,6,7};
        int target=3;
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
