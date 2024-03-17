package Day77;

import java.util.HashSet;
import java.lang.*;

public class unionArr {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
             set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        return  set.size();
    }
}
