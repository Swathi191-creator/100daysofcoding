package Day73;

public class pivot {
    public static void main(String[] args) {
        int n=2;
        System.out.println(pivotInteger(n));
    }
    public  static int pivotInteger(int n) {
        int firstIndex = 1;
        int secondIndex = n;
        int firstSum = 1;
        int secondSum = n;

        while (firstIndex <= secondIndex) {
            if (firstSum < secondSum) {
                firstIndex++;
                firstSum += firstIndex;
            } else if (firstSum > secondSum) {
                secondIndex--;
                secondSum += secondIndex;
            } else {
                if (firstIndex == secondIndex) {
                    return firstIndex;
                } else {
                    firstIndex++;
                    firstSum += firstIndex;
                    secondIndex--;
                    secondSum += secondIndex;
                }
            }
        }

        // If no pivot integer found
        return -1;
    }
}
