class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> resultSet = new HashSet<Integer>();

        for (int item : nums1)
            set.add(item);

        for (int item : nums2) {
            if (set.contains(item)) {
                resultSet.add(item);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (Integer i : resultSet) {
            result[index++] = i.intValue();
        }
        return result;
    }
}