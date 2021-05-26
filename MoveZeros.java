class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return;
        int temp;
        for (int i = 0, j = 0; i < nums.length;) {
            if (nums[i] == 0) {

                while (j < nums.length && nums[j] == 0) {
                    j++;
                }

                if (j < nums.length) {
                    // swap
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            i++;
            if (i > j)
                j = i;
        }

        return;
    }
}