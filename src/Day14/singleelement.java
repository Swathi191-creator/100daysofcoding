package Day14;

public class singleelement {
    public static void main(String[] args) {
        int[] arr={3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
