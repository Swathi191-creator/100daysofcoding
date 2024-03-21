package Day81;

import java.util.Arrays;
import java.util.Comparator;

public class mergeOverlapping {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int[][] ans = new int[n][2];
        int idx = -1;
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (idx >= 0 && end <= ans[idx][1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ans[++idx][0] = start;
            ans[idx][1] = end;
        }
        return Arrays.copyOf(ans, idx + 1);
    }
}
