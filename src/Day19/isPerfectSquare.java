package Day19;

public class isPerfectSquare {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
    public  static boolean isPerfectSquare(int num) {
        int start=0;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sqrt=(long)mid*mid;
            if(sqrt==num){
                return true;
            }else if(sqrt>num){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
