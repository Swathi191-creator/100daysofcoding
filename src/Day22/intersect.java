package coding;

import java.util.ArrayList;
import java.util.Arrays;



//  https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0, j = 0;        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                arr.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] intersect_elements = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            intersect_elements[k] = arr.get(k);
        }
        return intersect_elements;
    }
}
