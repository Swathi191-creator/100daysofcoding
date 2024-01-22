package Day6;

public class maxsubarray {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,1,1,1};
        int k=3;
        System.out.println(subarray(arr,k));
    }
    static int subarray(int[] arr,int k) {
        int right = 0;
        int left = 0;
        int length = 0;
        int n = arr.length;
        int sum = arr[0];
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                length = Math.max(length, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return length;
    }
    }

