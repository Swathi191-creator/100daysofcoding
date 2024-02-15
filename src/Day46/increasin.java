package Day46;

public class increasin {
    public static void main(String[] args) {
        int[] arr={1,5,0,4,1,3};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
            int small = Integer.MAX_VALUE;  // Initialize small to maximum value
            int big = Integer.MAX_VALUE;    // Initialize big to maximum value

            // Iterate through each number in the array
            for (int num : nums) {
                if (num <= small) {
                    // If the current number is less than or equal to small, update small
                    small = num;
                } else if (num <= big) {
                    // If the current number is greater than small but less than or equal to big, update big
                    big = num;
                } else {
                    // If we find a number greater than both small and big, return true
                    return true;
                }
            }

            // If we haven't found a triplet, return false
            return false;
    }
}
