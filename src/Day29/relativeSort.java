package Day29;

import java.util.ArrayList;
import java.util.Collections;

public class relativeSort {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(relativeSortArray(arr1,arr2));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> elementsPresent = new ArrayList<>();
        ArrayList<Integer> elementsNotPresent = new ArrayList<>();

        for (int value : arr2) {
            for (int k : arr1) {
                if (k == value) {
                    elementsPresent.add(k);
                }
            }
        }

        for (int k : arr1) {
            boolean found = false;
            for (int i : arr2) {
                if (k == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                elementsNotPresent.add(k);
            }
        }

        Collections.sort(elementsNotPresent);
        elementsPresent.addAll(elementsNotPresent);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = elementsPresent.get(i);
        }

        return arr1;
    }
}
