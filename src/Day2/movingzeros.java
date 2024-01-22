package Day2;
import java.util.Arrays;
public class movingzeros {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        moveZeroes(arr);
    }

        static void moveZeroes(int[] nums) {
            int count = 0;
            int n=nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[count] = nums[i];
                    count++;
                }
            }
            for (int i = count; i < n; i++) {
                nums[i] = 0;
            }
            System.out.print(Arrays.toString(nums));
        }
    }


