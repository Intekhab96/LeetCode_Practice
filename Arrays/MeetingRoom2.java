/**
 * Definition of Interval: public classs Interval { int start, end; Interval(int
 * start, int end) { this.start = start; this.end = end; } }
 */

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here
        if (intervals == null || intervals.size() == 0)
            return 0;
        if (intervals.size() == 1)
            return 1;

        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];

        for (int i = 0; i < intervals.size(); i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int result = 0, count = 0;
        int s = 0, e = 0;

        while (s < intervals.size()) {
            if (start[s] < end[e]) {
                s++;
                count += 1;
            } else {
                e += 1;
                count -= 1;
            }
            result = Math.max(result, count);
        }

        return result;
    }
}