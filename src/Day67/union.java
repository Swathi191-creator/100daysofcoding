package Day67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class union {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 3};
        int[] b={2,2,4};
        System.out.println(sortedArray(a,b));

    }
        public static List<Integer> sortedArray(int[] a, int[] b) {
            ArrayList<Integer> list=new ArrayList<>();

            for (int i = 0; i < a.length; i++) {
                if (!list.contains(a[i])) {
                    list.add(a[i]);
                }
            }


            for (int j = 0; j < b.length; j++) {
                if (!list.contains(b[j])) {
                    list.add(b[j]);
                }
            }

            Collections.sort(list);
            return list;
        }

}
