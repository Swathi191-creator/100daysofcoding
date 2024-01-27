package Day27;

import java.util.Arrays;



// https://leetcode.com/problems/largest-perimeter-triangle/description/


public class maxPerimeter {
    public static void main(String[] args) {
        int[] arr={3,2,3,4};
        System.out.println(largestPerimeter(arr));
    }
    public  static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxperimeter=0;
        for(int i=0;i<nums.length-2;i++){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            if(a+b > c){
                int perimeter=a+b+c;
                maxperimeter=Math.max(maxperimeter,perimeter);


            }
        }
        return maxperimeter;
    }
}
