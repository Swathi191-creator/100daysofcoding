package Day27;


// https://leetcode.com/problems/squares-of-a-sorted-array/
public class square {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        System.out.println(sortedSquares(arr));
    }
    public  static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int square=nums[i]*nums[i];
            nums[i]=square;
        }

        // Arrays.sort(nums);


        for(int i=0;i<nums.length;i++){
            boolean finding=false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    finding=true;
                }
            }

            if(!finding){
                return nums;
            }
        }
        return nums;
    }
}
