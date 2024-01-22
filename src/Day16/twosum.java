package Day16;

public class twosum {
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int target=9;
        System.out.println(twoSum(arr,target));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int num=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    arr[num]=i+1;
                    arr[num+1]=j+1;
                }
            }
        }
        return arr;
    }



    // public int[] twoSum(int[] numbers, int target) {
    //     int left = 0;
    //     int right = numbers.length - 1;

    //     while (left < right) {
    //         int sum = numbers[left] + numbers[right];

    //         if (sum == target) {
    //             return new int[]{left + 1, right + 1};
    //         } else if (sum < target) {
    //             left++;
    //         } else {
    //             right--;
    //         }
    //     }
    //     return new int[0];
    // }
}
