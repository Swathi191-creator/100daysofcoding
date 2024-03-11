package Day71;

import java.util.Arrays;

public class hindex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int i = 0; i < n; i++){
            int h = n - i;
            if(citations[i] >= h){
                return h;
            }
        }
        return 0;
    }
}
