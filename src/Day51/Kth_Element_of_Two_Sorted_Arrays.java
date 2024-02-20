package Day51;

import java.util.ArrayList;
import java.util.Collections;

public class Kth_Element_of_Two_Sorted_Arrays {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {

        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(arr1);
        mergedList.addAll(arr2);

        Collections.sort(mergedList);

        return mergedList.get(k - 1);
    }
}
