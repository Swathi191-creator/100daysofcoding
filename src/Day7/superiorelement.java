package Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class superiorelement {
    public static void main(String[] args) {
        int [] arr={5 ,4 ,3};
        System.out.println(superiorElements(arr));
    }
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> list=new ArrayList<>();
        list.add(a[a.length-1]);
        int num=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                num=a[j];
                if(a[j]>=a[i]){
                    break;
                }
            }
            if(a[i]>num){
                list.add(a[i]);
            }
        }
        return (list);

    }
}
