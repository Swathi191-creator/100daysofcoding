package Day84;

import java.util.ArrayList;

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i+1)==arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}