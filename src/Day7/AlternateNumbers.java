package Day7;

import java.util.Arrays;

public class AlternateNumbers {
    public static void main(String[] args) {
            int[] a={1, 2, -4, -5};
        System.out.println(alternateNumbers((a)));
    }
    public static int[] alternateNumbers(int[] a) {
        // Write your code here.
        int [] positive=new int[a.length/2];
        int [] negative=new int[a.length/2];
        int temp=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] > 0) {
                positive[temp] = a[i];
                temp++;
            }
        }
        temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                negative[temp] = a[i];
                temp++;
            }
        }
        int num=0;
        int i=0;
        while(i<a.length){
            a[i]=positive[num];
            i++;
            a[i]=negative[num];
            i++;
            num++;
        }
        return a;
    }
}
