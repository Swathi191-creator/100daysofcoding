package Day56;

public class reversingarray {
    public static int[] reverseArray(int n, int[] nums) {
        int[] reversedArray = new int[n];
        reverse(nums, reversedArray, 0, n - 1);
        return reversedArray;
    }

    public static void reverse(int[] nums, int[] reversedArray, int start, int end) {
        if (start <= end) {
            reversedArray[start] = nums[end];
            reversedArray[end] = nums[start];
            reverse(nums, reversedArray, start + 1, end - 1);
        }
    }
}
