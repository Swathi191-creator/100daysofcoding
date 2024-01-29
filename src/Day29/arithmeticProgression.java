package Day29;

import java.util.Arrays;

public class arithmeticProgression {
    public static void main(String[] args) {
    int[] arr={3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int num1=arr[0];
        int num2=arr[1];
        int diff=num2-num1;
        boolean find=false;
        if(arr.length<3){
            find=true;
        }
        for(int i=1;i<arr.length-1;i++){
            int minus=arr[i+1]-arr[i];
            if(diff==minus){
                find=true;
            }else{
                find=false;
                break;
            }
        }
        return find;
    }
}
