package Day25;

import java.util.Arrays;

// https://leetcode.com/problems/contains-duplicate/submissions/1156485113/
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        // for(int i=0;i<nums.length;i++){
        //       int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>=2){
        //         return true;
        //     }
        // }
        // return false;

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;

    }
}
