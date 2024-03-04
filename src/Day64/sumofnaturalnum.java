package Day64;

public class sumofnaturalnum {
    public static void main(String[] args) {
        int n=10;
        System.out.println(find(n));
    }
    public static int find(int n)
    {
        // code here
        int count=1;
        int num=1;
        while (num <= n){
            int sum=num * (num+1)/2;
            if(sum==n){
                return count;
            }
            num++;
            count++;
        }
        return -1;
    }
}
