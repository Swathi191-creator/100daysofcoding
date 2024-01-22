package Day13;

public class findminimumsorted {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2}; 
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[start] <= nums[end]) {
                ans = Math.min(ans, nums[start]);
            }

            if (nums[start] <= nums[mid]) {
                ans = Math.min(ans, nums[start]);
                start = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}

