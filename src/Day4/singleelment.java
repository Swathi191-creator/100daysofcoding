package Day4;

public class singleelment {
    public static void main(String[] args) {
        int [] arr={2,2,1};
        System.out.println(finding(arr));
    }

    static int finding(int[] nums) {

//        for (int i = 0; i < arr.length; i = i + 2) {
//            int count = 1;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    break;
//                }
////                 count=1;
//            }
//            if (count == 1) {
//                return arr[i];
//            }
//        }
//        return -1;



        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }

        for(int i=0;i<n;i++){
            int count=1;
            for( int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                    break;
                }

            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }
}
