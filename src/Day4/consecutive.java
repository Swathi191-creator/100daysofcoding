package Day4;

import java.util.ArrayList;

public class consecutive {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1,0,1,1};
        int ans = consecutive(arr);
        System.out.println(ans);
    }

    static int consecutive(int[] nums) {
//        int count=1;
//        int max=0;
//        for(int i=1;i<nums.length;i++){
//            int num=nums[i-1];
//            if(num==nums[i]){
//                count++;
//                continue;
//            }
//            count=1;
//            if (count > max) {
//
//                max=count;
//            }
//        }
//        return count;

//        int count=0;
//        int max=1;
//        if(nums.length==0){
//            return 0;
//        }
//        if(nums.length==1){
//            return nums[0];
//        }
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==nums[i-1]){
//                if(nums[i]==1){
//                    count=1;
//                    count++;
//                    max=count;
//                    continue;
//                }else{
//                    max=0;
//                }
//            }
////            count=1;
//            if(max<=count){
//                max=count;
//            }
//        }
//        return max;

        int count=0;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }else{
                count=0;
            }
        }
        return max;
    }
}


