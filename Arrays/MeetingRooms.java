
public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        if (intervals == null || intervals.size() == 1)
            return true;
        Collections.sort(intervals, (a, b) -> {
            return Integer.compare(a.start, b.start);
        });
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i - 1).end > intervals.get(i).start)
                return false;
        }

        return true;

    }
}