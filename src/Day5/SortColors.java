package Day5;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for (int nums:arr) {
            System.out.print(nums+" ");
        }
    }

    public static  void sortColors(int[] nums) {
        int [] arr=new int[nums.length];
        int index=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    arr[index]=i;
                    index++;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }

    }
}
