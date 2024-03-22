package Day82;

import java.util.ArrayList;
import java.util.List;

public class nextPermutation {
    public static List<Integer> main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};

        int n = arr.length;
        int i = n - 2;
        for (; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                break;
            }
        }
        if (i >= 0) {
            int j = n - 1;
            for (; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    break;
                }
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }

        return result;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    }

