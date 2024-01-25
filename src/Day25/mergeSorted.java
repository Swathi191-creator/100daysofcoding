package Day25;

import java.util.Arrays;


// https://leetcode.com/problems/merge-sorted-array/description/

public class mergeSorted {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m= nums1.length;
        int[] nums2={2,5,6};
        int n=nums2.length;
        merge(nums1,m,nums2,n);
    }
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2_index=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                if(nums2_index<nums2.length){
                    nums1[i]=nums2[nums2_index];
                    nums2_index++;
                }
            }
        }
        // Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            for(int j=1;j<nums1.length-i;j++){
                if(nums1[j-1]>nums1[j]){
                    int temp=nums1[j-1];
                    nums1[j-1]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(nums1));
    }
}
