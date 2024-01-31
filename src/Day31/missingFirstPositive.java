package Day31;

import java.util.Arrays;

public class missingFirstPositive {
    public static void main(String[] args) {
    int[] arr={3,4,-1,1};
    System.out.println(firstMissingPositive(arr));
    }
    public  static int firstMissingPositive(int[] nums) {
        int number=1;
//        Arrays.sort(nums);
//        boolean find=false;
//        int ans=number;
        int i=0;
        while(i<nums.length){
            if(number==nums[i]){
                number++;
//                find=true;
                i=0;
            }else{
                i++;
            }

        }
//        if(find==false)
//            ans=number;

        return number;

    }
}
