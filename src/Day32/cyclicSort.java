package Day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
//            if (correct == nums.length) {
//                i++;
//                continue;
//            } else {
                if (nums[i] != nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else {
                    i++;
                }
            }
//        }


        int missing_num = nums.length;
        for (int j = 0; j < nums.length; j++) {
            if (j+1 != nums[j]) {
                arr.add(j+1);
            }
        }
        return arr;
    }
}


