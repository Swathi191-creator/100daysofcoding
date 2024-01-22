package Day5;
import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int [] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

        // int n=nums.length;
        // int max=n/2;
        // for(int i=0;i<n;i++){
        //     int num=nums[i];
        //     int count=1;
        //     for(int j=i+1;j<n;j++){
        //         if(num==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(max<count){
        //         return nums[i];
        //     }
        // }
        // return max;
    }
}
