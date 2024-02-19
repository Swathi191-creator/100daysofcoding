package Day50;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newLength = nums1.length + nums2.length;
        int[] newArr = new int[newLength];

        System.arraycopy(nums1, 0, newArr, 0, nums1.length);
        System.arraycopy(nums2, 0, newArr, nums1.length, nums2.length);
        Arrays.sort(newArr);
        if(newLength%2==1){
            return newArr[newLength/2];
        }else{
            int middle1 = newLength / 2 - 1;
            int middle2 = newLength / 2;
            return (newArr[middle1] + newArr[middle2]) / 2.0;
        }
    }
}
