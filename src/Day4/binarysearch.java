package Day4;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int target = 85;
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
       // bruteforce approach
           static int missingNumber(int[] nums) {
               int count=0;
               int n=nums.length;
               for(int i=0;i<=n;i++){
                   for(int j=0;j<n;j++){
                       if(i!=nums[j]){
                           count=0;
                           continue;
                       }else{
                           count=1;
                           break;
                       }

                   }
                   if(count==0){
                       return i;
                   }else{
                       continue;
                   }
               }
               return -1;
           }


           // optimal solution
//                  static int missingNumber(int[] nums) {
//                   int n=nums.length;
//                   int sum=n*(n+1)/2;
//                   int nums_sum=0;
//                   for(int i=0;i<n;i++){
//                       nums_sum+=nums[i];
//                   }
//                   int ans=sum-nums_sum;
//                   return ans;
//               }


}