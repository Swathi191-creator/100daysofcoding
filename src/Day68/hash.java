package Day68;

public class hash {
    public static int[] countFrequency(int n, int x, int[] arr) {
        int[] hash = new int[n];
        for(int i=0;i<n;i++)
        {
            try{
                hash[arr[i]-1] +=1;

            }catch(Exception a){}
        }
        return hash;
    }
}
