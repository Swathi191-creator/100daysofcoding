package Day8;

import java.util.Arrays;

public class longestconsecutive {
    public static void main(String[] args) {
        int [] arr={100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 1;
        int length = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {
            int num1 = nums[i - 1];
            int num2 = nums[i];


            if (num2 - num1 == 1|| num2 - num1 == 0  ) {
                if (num2 - num1 == 1) {
                    count++;
                }
                length = count;
            } else {
                count = 1;
            }

            max = Math.max(max, length);
        }

        return max;
    }
}
