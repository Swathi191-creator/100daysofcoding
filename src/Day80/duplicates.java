package Day80;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class duplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i] )){
                s.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }

        }
        ArrayList<Integer> ans = new ArrayList<>(s);
        if(ans.size() ==0){
            ans.add(-1);
        }
        Collections.sort(ans);
        return ans;
    }
}
