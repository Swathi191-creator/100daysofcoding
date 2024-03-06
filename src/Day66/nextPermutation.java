package Day66;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class nextPermutation {
    static List<Integer> nextPermutation(int N, int arr[]) {
        ArrayList<Integer> arrNew = new ArrayList<>();
        for (int num : arr) {
            arrNew.add(num);
        }

        int index = -1;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                index = i;
            }
        }

        if (index == -1) {
            Collections.sort(arrNew);
            return arrNew;
        }

        int index2 = -1;
        for (int j = N - 1; j > index; j--) {
            if (arr[j] > arr[index]) {
                index2 = j;
                break;
            }
        }

        int temp = arrNew.get(index);
        arrNew.set(index, arrNew.get(index2));
        arrNew.set(index2, temp);

        List<Integer> subList = arrNew.subList(index + 1, N);
        Collections.reverse(subList);

        return arrNew;
    }
}
