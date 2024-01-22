package Day9;

public class floorofnumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length - 1]) {
            System.out.println("-1");
            return; // Add return statement to exit the program if target is greater than the largest element
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                return;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(arr[end]); // Print the closest smaller number if target is not found
    }
}

