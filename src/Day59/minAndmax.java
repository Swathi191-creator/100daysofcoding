package Day59;

public class minAndmax {
        static <Pair> Pair getMinMax(long a[], long n) {
            // Write your code here
            long min = a[0];
            long max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                } else if (a[i] > max) {
                    max = a[i];
                }
            }

            return new Pair(min, max);
        }
}
