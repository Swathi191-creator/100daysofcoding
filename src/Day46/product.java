package Day46;

import java.util.Arrays;

public class product {
    public static void main(String[] args) {
    int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
        public  static int[] productExceptSelf(int[] nums) {
//            int[] ans = Arrays.copyOf(nums, nums.length);
//            for(int i=0;i<ans.length;i++){
//                int pdt=1;
//                for(int j=0;j<ans.length;j++){
//                    if(i!=j){
//                        pdt*=ans[j];
//                    }
//                }
//                nums[i]=pdt;
//            }
//            return nums;


//            int n = nums.length, mult = 1;
//            int[] ans = new int[n];
//            for(int i = 0; i<n; i++){
//                ans[i] = mult;
//                mult*=nums[i];
//            }
//            mult = 1;
//            for(int j = n-1; j>=0; j--){
//                ans[j]*=mult;
//                mult*=nums[j];
//            }
//            return ans;

            int n = nums.length, mult = 1;
            int[] ans = new int[n];

            // Calculate the product of all elements before the current index
            for (int i = 0; i < n; i++) {
                ans[i] = mult;  // Store the product of elements before i at ans[i]
                mult *= nums[i];  // Update mult with the product so far
            }

            mult = 1;  // Reset mult to 1 for the next loop

            // Calculate the product of all elements after the current index
            for (int j = n - 1; j >= 0; j--) {
                ans[j] *= mult;  // Multiply the product before and after j
                mult *= nums[j];  // Update mult with the product so far
            }

            return ans;  // Return the array containing the products

        }
}
