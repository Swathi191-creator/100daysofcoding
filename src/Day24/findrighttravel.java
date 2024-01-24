package Day24;

public class findrighttravel {
    public int[] findRightInterval(int[][] intervals) {
        int[] right_travel = new int[intervals.length];
        int count = 0;

        for (int i = 0; i < intervals.length; i++) {
            int interval_end = intervals[i][1];
            boolean found = false;
            int minStart = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = 0; j < intervals.length; j++) {
                int interval_start = intervals[j][0];

                if (interval_start >= interval_end && interval_start < minStart) {
                    minStart = interval_start;
                    minIndex = j;
                    found = true;
                }
            }

            if (found) {
                right_travel[count] = minIndex;
            } else {
                right_travel[count] = -1;
            }

            count++;
        }

        return right_travel;
    }
}
