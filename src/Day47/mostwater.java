package Day47;

public class mostwater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public  static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_water=0;
        while(left<=right){
            int min=Math.min(height[left],height[right]);
            int distance=right-left;

            if(max_water<(min*distance)){
                max_water=min*distance;
            }

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_water;
    }
}
