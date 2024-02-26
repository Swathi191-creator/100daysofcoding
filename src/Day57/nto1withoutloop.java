package Day57;

public class nto1withoutloop {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        int start = 0;
        return arr(arr, start, x);
    }

    public static int[] arr(int[] arr, int start, int x) {
        if (start == x) {
            return arr;
        }
        arr[start] = x - start;
        return arr(arr, start + 1, x);
    }
}
