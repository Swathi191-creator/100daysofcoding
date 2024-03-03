package Day63;

import java.util.Arrays;
import java.util.Comparator;

public class largestNum {
    public static void main(String[] args) {
        int n=5;
        String arr[] =  {"3", "30", "34", "5","9"};
        System.out.println(printLargest(n, arr));
    }
    public static String printLargest(int n, String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        StringBuilder str = new StringBuilder();
        for (String s : arr) {
            str.append(s);
        }
        return str.toString();
    }
}
