package Day67;

import java.util.*;

public class sorting0s1s {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}
