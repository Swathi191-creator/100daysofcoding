package Day25;
// https://leetcode.com/problems/third-maximum-number/
import java.util.ArrayList;
import java.util.Arrays;  // Don't forget to import Arrays

public class minimum3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!arr.contains(nums[i])) {
                arr.add(nums[i]);
            }
        }

        int[] uniqueArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            uniqueArray[i] = arr.get(i);
        }

        Arrays.sort(uniqueArray);
        if (uniqueArray.length < 3) {
            return uniqueArray[uniqueArray.length - 1];
        } else {
            return uniqueArray[uniqueArray.length - 3];
        }
    }
}
