package Day2;
import java.util.* ;
import java.io.*;

public class leftrotation {
    public static void main(String[] args) {
  int[] arr={1,2,3,4,5};
  int n=5;
        System.out.println(Arrays.toString(rotateArray(arr,n)));
    }
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int num=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=num;
        return arr;

    }
}

