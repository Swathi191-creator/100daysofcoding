package Day8;

import java.util.ArrayList;
import java.util.List;

public class majorityelements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 3};
        List<Integer> result = majorityElement(arr);

        // Print the elements in the list
        System.out.println("Majority Elements:");
        for (Integer element : result) {
            System.out.println(element);
        }
    }

    public static List<Integer> majorityElement(int[] v) {
        int max = 0;
        int n = v.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int temp = v[i];
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                if (temp == v[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                if (max > n / 3) {
                    list.add(v[i]);
                }
            }
        }

        return list;
    }
}
