package Day49;

public class countdigits {
    public static void main(String[] args) {
    int n=660;
        System.out.println(countDigits(n));
    }
    public static int countDigits(int n){
        // Write your code here.
        int duplicte_num=n;
        int count=0;
        while(n>0){
            int num=n%10;
            if(num!=0&&duplicte_num%num==0){
                count++;
            }

            n=n/10;
        }
        return count;
    }
}
