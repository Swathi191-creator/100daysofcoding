package Day26;

import java.util.Arrays;


//  https://leetcode.com/problems/maximum-product-of-three-numbers/
public class maxproduct3Num {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int first_pdct=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int second_pdct=nums[0]*nums[1]*nums[nums.length-1];

        int max=Math.max(first_pdct,second_pdct);
        return max;
    }

    }
