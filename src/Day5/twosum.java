package Day5;

public class twosum {
    public static void main(String[] args) {
        int [] arr={4, 1, 2, 3, 1};
        int n=arr.length;
        int target=5;
        System.out.println(read(n,arr,target));
    }
    public static String read(int n, int[] book, int target) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = book[i] + book[j];
                if (sum == target) {
                    return "YES";
                }
            }
        }
        return "NO";
}
}
