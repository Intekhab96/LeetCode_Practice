class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        int[] current_interval = intervals[0];
        List<int[]> output_arr = new ArrayList<>();
        output_arr.add(current_interval);
        for (int i = 1; i < intervals.length; i++) {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = intervals[i][0];
            int next_end = intervals[i][1];
            if (next_begin <= current_end) {
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = intervals[i];
                output_arr.add(current_interval);
            }
        }

        return output_arr.toArray(new int[output_arr.size()][]);
    }
}