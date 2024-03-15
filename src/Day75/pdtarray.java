package Day75;

public class pdtarray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
    public  static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] leftArr=new int[n];
        int[] rightArr=new int[n];

        int leftpdt=1;
        int rightpdt=1;
        leftArr[0]=1;
        rightArr[n-1]=1;

        for(int i=1;i<n;i++){
            leftpdt*=nums[i-1];
            leftArr[i]=leftpdt;
        }
        for(int j=n-2;j>=0;j--){
            rightpdt*=nums[j+1];
            rightArr[j]=rightpdt;
        }

        for(int k=0;k<n;k++){
            nums[k]=leftArr[k]*rightArr[k];
        }
        return nums;

    }
}
