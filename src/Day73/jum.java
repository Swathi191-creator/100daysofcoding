package Day73;

public class jum {
    public static void main(String[] args) {
        int[] nums={2,5,0,0};
        System.out.println(canJump(nums));
    }
    public  static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int j = 0;
        while (j < nums.length) {
            int i = nums[j];
            if (i == 0 && j < nums.length - 1) {
                return false;
            }
            j = j + i;
            if (j >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
