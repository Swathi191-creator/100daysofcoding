package Day15;

public class implementinglowerbound {
    public static void main(String[] args) {
        int[] arr={};
        int x=0;
        int n= arr.length;
        System.out.println(lowerBound(arr,n,x));
    }
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}
