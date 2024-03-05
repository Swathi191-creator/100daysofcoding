package Day65;

public class fibo {
    public static long[] printFibb(int n)
    {
        //Your code here
        long[] arr=new long[n];
        if(n==1){
            arr[0]=1;
            return arr;
        }

        arr[0]=1;
        arr[1]=1;
        if(n==2){
            return arr;
        }

        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr;
    }
}
