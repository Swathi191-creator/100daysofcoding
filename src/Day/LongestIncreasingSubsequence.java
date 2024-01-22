package Day;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] arr={0,1,0,3,2,3};
        System.out.println(subarray(arr));
    }
   static int subarray(int [] nums){
       int count=0;
       int max=0;
       for(int i=0;i<nums.length;i++){
           count=1;
           for(int j=i+1;j<nums.length;j++){
               int num=nums[j-1];
               if(num<nums[j]){
                   count++;
                   if(max<count){
                       max=count;
                   }
                   continue;
               }
               break;
           }
       }
       return max+1;
   }
}
