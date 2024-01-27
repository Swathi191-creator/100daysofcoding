package Day27;

import java.util.Arrays;


//  https://leetcode.com/problems/height-checker/
public class heightChecker {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }

        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }

        return count;
    }
}
