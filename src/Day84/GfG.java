package Day84;

class GfG
{
	public static int palinArray(int[] a, int n){
        //add code here.
        for(int i=0;i<n;i++){
            if(!ispalindromic(a[i])){
                return 0;
            }
        }
        return 1;
                  
    }
    private static boolean ispalindromic(int n){
        int original=n;
        int reversed=0;
        while(n>0){
            int rem=n%10;
            reversed=reversed*10+rem;
            n=n/10;
        }
        return original==reversed;
    }
}