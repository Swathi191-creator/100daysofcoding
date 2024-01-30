package Day30;

import java.util.Arrays;

public class setMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            boolean find=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]) {
                    find = true;
                    break;
                }
            }
            if(find==false){
                ans[1]=i;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j > 0 && nums[j] == nums[j - 1]) {
                ans[0] = nums[j];
                break;
            }
        }
        return ans;
    }
}
