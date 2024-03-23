package Day83;

public class Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,1};
        int n=arr.length;
        System.out.println(peakElement(arr,n));
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
