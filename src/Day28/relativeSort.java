package Day28;

import java.util.Arrays;

public class relativeSort {
    public static void main(String[] args) {
        int[] arr1={3,4,5,2};
        System.out.println(maxProduct(arr1));
    }
    public  static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int num1=nums[n]-1;
        int num2=nums[n-1]-1;
        int ans=num1*num2;
        return ans;

        // for(int i=0;i<nums.length;i++){
        //     boolean finding=false;
        //     for(int j=1;j<nums.length-i;j++){
        //         if(j>0 && nums[j-1]>nums[j]){
        //             int temp=nums[j-1];
        //             nums[j-1]=nums[j];
        //             nums[j]=temp;
        //             finding=true;
        //         }
        //     }
        //     if(!finding){
        //         break;
        //     }
        // }

    }
}
