package Day62;

public class revdigits {
    public static void main(String[] args) {
        int x=1534236469;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {

        boolean isnegative=false;
        if(x<0){
            isnegative=true;
            x=-x;
        }
        int rev=0;
        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = (rev * 10) + rem;
        }
        if(isnegative){
            rev=-rev;
        }
        return rev;
    }
}
