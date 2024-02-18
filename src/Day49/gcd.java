package Day49;

public class gcd {
    public static void main(String[] args) {
        int n=6;
        int m=9;
        System.out.println(calcGCD(n,m));
    }
    public static int calcGCD(int n, int m){
        // Write your code here.
        int i=1;
        int divisible_num=1;
        while(i<n&&i<m){
            if(n%i==0&&m%i==0){
                divisible_num=i;
            }
            i++;
        }
        return divisible_num;
    }
}
