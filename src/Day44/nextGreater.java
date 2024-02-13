package Day44;

import java.util.Arrays;

public class nextGreater {
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
        public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
            for(int i = 0; i < nums1.length; i++){
                int nextGreater = -1;
                boolean found = false;
                for(int j = 0; j < nums2.length; j++){
                    if(nums2[j] == nums1[i]) {
                        found = true;
                    }
                    if(found && nums2[j] > nums1[i]) {
                        nextGreater = nums2[j];
                        break;
                    }
                }
                nums1[i] = nextGreater;
            }
            return nums1;
        }
}
