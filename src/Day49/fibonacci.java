package Day49;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            if(i==0){
                arr[i]=1;
            }else if(i==1){
                arr[i]=1;
            }else{
                arr[i]=arr[i-1]+arr[i-2];
            }
        }

        System.out.println(arr[num-1]);

    }
}
