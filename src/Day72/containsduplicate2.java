package Day72;

public class containsduplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length && j <= i + k; j++) {
            if (nums[i] == nums[j]) {
                return true;
            }
        }
    }
        return false;
    }
}
