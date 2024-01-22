package Day6;

public class kadanesalgorithm {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int n=nums.length;

        // if(n==1){
        //     return nums[0];
        // }
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum=sum+nums[j];
        //         if(sum>max){
        //             max=sum;
        //         }
        //     }
        // }
        // return max;


        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
