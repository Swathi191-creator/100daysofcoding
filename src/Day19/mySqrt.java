package Day19;

public class mySqrt {
    public static void main(String[] args) {
        int num=16;
        System.out.println(mySqrt(num));
    }
    public static int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sqrt=(long)mid*mid;
            if(sqrt==x){
                return mid;
            }else if(sqrt>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
}
