package Day26;


// https://leetcode.com/problems/sort-array-by-parity-ii/
public class sorArrayii {
    public int[] sortArrayByParityII(int[] nums) {
        // int n=nums.length/2;
        // int[] odd_arr=new int[n];
        // int[] even_arr=new int[n];
        // int index=0;
        // int num=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]%2==0){
        //         even_arr[index]=nums[i];
        //         index++;
        //     }else{
        //         odd_arr[num]=nums[i];
        //         num++;
        //     }
        // }
        // int j=0;
        // int k=0;
        // for(int i=0;i<nums.length;i++){
        //     if(i%2==0){
        //      nums[i]=even_arr[j];
        //      j++;
        //     }else{
        //         nums[i]=odd_arr[k];
        //         k++;
        //     }
        // }
        // return nums;




        int[] arr=new int[nums.length];
        int evenPlace=0;
        int oddPlace=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[evenPlace]=nums[i];
                evenPlace+=2;
            }else{
                arr[oddPlace]=nums[i];
                oddPlace+=2;
            }
        }
        return arr;
    }
}
