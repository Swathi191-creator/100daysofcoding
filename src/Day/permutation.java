package Day;
import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        int [] arr={2,0,2,1,1,0};
        sortColors(arr);
    }

    public static void sortColors(int[] nums) {
        int [] arr=new int[nums.length];
        int index=0;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    arr[index] = i;
                    index++;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    }

