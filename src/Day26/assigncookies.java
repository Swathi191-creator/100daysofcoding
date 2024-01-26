package Day26;

import java.util.Arrays;

public class assigncookies {
    public static void main(String[] args) {
    int[] arr1={10,9,8,7,10,9,8,7};
    int[] arr2={10,9,8,7};
        System.out.println(findContentChildren(arr1,arr2));
    }
    public  static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}
