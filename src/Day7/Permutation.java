package Day7;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(nextGreaterPermutation(arr));
    }

    public static int[] nextGreaterPermutation(int[] A) {
        int index = -1;
        int n = A.length;

        // Find the index where the current permutation is not in descending order
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                index = i;
                break;
            }
        }

        // If the index is -1, the array is in descending order, reverse it and return
        if (index == -1) {
            reverseArray(A, 0, n - 1);
            return A;
        }

        // Find the smallest element in the sublist to the right of the index,
        // which is greater than the element at the index
        for (int i = n - 1; i > index; i--) {
            if (A[i] > A[index]) {
                swap(A, index, i);
                break;
            }
        }

        // Reverse the sublist to the right of the index
        reverseArray(A, index + 1, n - 1);
        return A;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}




//    int index=-1;
//    int n=nums.size();
//        for(int i=n-2;i>=0;i--){
//                if(nums.get(i)<nums.get(i+1)){
//        index=i;
//        break;
//        }
//        }
//
//        if(index==-1){
//        Collections.reverse(nums);
//        return nums;
//        }
//
//        for(int i=n-1;i>index;i--){
//        if(nums.get(i)>nums.get(index)){
//        Collections.swap(nums, index, i);
//        break;
//        }
//        }
//
//        List<Integer> sublist = nums.subList(index + 1, n);
//        Collections.reverse(sublist);
//        return nums;
//


