package Day50;

import java.util.Scanner;

public class Check_Armstrong {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int duplicate=num;
        int original=num;
        int count=0;

        while(num>0){
            int remainder=num%10;
            count++;
            num=num/10;
        }
        int armstrong_num=0;
        while(duplicate>0){
            int remainder2=duplicate%10;
            armstrong_num+=Math.pow(remainder2, count);
            duplicate=duplicate/10;
        }

        if(original==armstrong_num){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
