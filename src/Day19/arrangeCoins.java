package Day19;

public class arrangeCoins {
    public static void main(String[] args) {
        int num=5;
        System.out.println(arrangeCoins(num));
    }
    public static int arrangeCoins(int n) {
        long sum=0;

        for(int i=1;i<=n;i++){
            sum+=i;
            if(sum>n){
                return i-1;
            }
        }
        return n;



        //    int start = 1;
        //     int end = n;

        //     while (start <= end) {
        //         int mid = start + (end - start) / 2;
        //         int midSum = sum(mid, n);

        //         if (midSum == n) {
        //             return mid;
        //         } else if (midSum > n) {
        //             end = mid - 1;
        //         } else {
        //             start = mid + 1;
        //         }
        //     }

        //     return end;
        // }

        // int sum(int mid, int n) {
        //     long sum = 0;
        //     for (int i = 1; i <= mid; i++) {
        //         sum += i;
        //     }

        //     return (int) sum;
        // }
    }
}
