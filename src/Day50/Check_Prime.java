package Day50;

public class Check_Prime {
    public static String isPrime(int num) {
        if (num < 2) {
            return "NO";
        }

        int count = 0;
        for (int i = 1; i  <= num; i++) {
            if (num % i == 0) {
                count++;
                if (count > 2) {
                    return "NO";
                }
            }
        }

        return (count == 2) ? "YES" : "NO";
    }
}
