class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1 || (nums.length == 2 && nums[0] > nums[1]))
            return 0;

        for (int i = 0; i < nums.length; i++) {
            if (i - 1 < 0 || nums[i] > nums[i - 1]) {
                if (i + 1 == nums.length || nums[i] > nums[i + 1])
                    return i;
            }
        }
        return 1;
    }
}