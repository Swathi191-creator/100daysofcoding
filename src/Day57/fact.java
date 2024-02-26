package Day57;

import java.util.ArrayList;
import java.util.List;

public class fact {
    public static List<Long> factorialNumbers(long n) {

        // Write Your Code Here
        List<Long> l = new ArrayList<>();
        check(1,n,l);
        return l;
    }
    static void check(long i,long n,List<Long> l){
        if( i > n){
            return;
        }
        if(n >= fact(i)){
            l.add(fact(i));
            check(i+1,n,l);
        }
    }

    static long fact(long n){
        if(n == 1){
            return 1;
        }
        return n *fact(n-1);

    }
}
