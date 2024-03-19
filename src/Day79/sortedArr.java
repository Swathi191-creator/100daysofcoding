package Day79;

import java.util.ArrayList;
import java.util.Collections;

public class sortedArr {
    public static void main(String[] args) {
        long[] arr1={};
        long[] arr2={};
        int n=arr1.length;
        int m= arr2.length;
        merge(arr1,arr2,n,m);
    }
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        ArrayList<Long> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            arr.add(arr2[i]);
        }

        Collections.sort(arr);
        for(int i=0;i<n;i++){
            arr1[i]=arr.get(i);
        }

        for(int j=0;j<m;j++){
            arr2[j]=arr.get(j+n);
        }
    }
}
