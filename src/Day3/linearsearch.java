package Day3;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 4, 1};
        int num = 4;
        int n = arr.length;
      int ans=  linearSearch(n, num, arr);
        System.out.println(ans);
    }

    public static int linearSearch(int n, int num, int[] arr) {
        // Write your code here.
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (num == arr[i]) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
