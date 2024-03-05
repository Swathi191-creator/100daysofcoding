package Day65;

public class pow4 {
    public static void main(String[] args) {
        int n=16;
        int num=0;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        if(n==0){
            return false;
        }
        while(n%4==0){
            n=n/4;
        }
        return n==1;
    }
}
