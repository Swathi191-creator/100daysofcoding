package coding;


//        https://leetcode.com/problems/fair-candy-swap/
public class faircandy {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] fairCandy = new int[2];
        int sumAlice = sum_of_array(aliceSizes);
        int sumBob = sum_of_array(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                int aliceCandy = aliceSizes[i];
                int bobCandy = bobSizes[j];

                if ((sumAlice - aliceCandy + bobCandy) == (sumBob - bobCandy + aliceCandy)) {
                    fairCandy[0] = aliceCandy;
                    fairCandy[1] = bobCandy;
                    return fairCandy;
                }
            }
        }

        return fairCandy;
    }

    int sum_of_array(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
