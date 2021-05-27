class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int temp;
        int i = 0;
        int j = nums.length - 1;
        for (; i <= j;) {
            if (nums[i] == val) {
                while (j >= 0 && nums[j] == val) {
                    j--;
                }
                if (j >= 0 && i <= j) {
                    // swap
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
            i++;
        }

        return j >= 0 ? j + 1 : 0;
    }
}