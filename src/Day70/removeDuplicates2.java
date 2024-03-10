package Day70;

public class removeDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int count = 1;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
            } else {
                res += Math.min(count, 2);
                count = 1;
            }
        }
        System.out.println(res);
    }
}
