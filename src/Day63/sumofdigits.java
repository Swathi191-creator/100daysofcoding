package Day63;

public class sumofdigits {
    public static void main(String[] args) {
        int n=12345;
        System.out.println( repeatedSumOfDigits(n));
    }
    static int repeatedSumOfDigits(int N) {
        int sum = 0;
        while (N > 0) {
            int rem = N % 10;
            N = N / 10;
            sum += rem;
        }

        if (sum < 10) {
            return sum;
        } else {
            return repeatedSumOfDigits(sum);
        }
    }
    }
