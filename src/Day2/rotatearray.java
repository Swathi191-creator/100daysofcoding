package Day2;

public class rotatearray {
    public static void main(String[] args) {
        int[] originalArray = {-1};
        int rotateBy = 2;

        int[] rotatedArray = rotateRight(originalArray, rotateBy);
        displayArray(rotatedArray);
    }
    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rotateRight(int[] array, int k) {
        int length = array.length;
        reverse(array, 0, length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, length - 1);

        return array;
    }
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

