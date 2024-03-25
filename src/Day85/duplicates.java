package Day85;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicates {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])) {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}
