class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length <= 2)
            return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int remPart = -1 * nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int partSoFar = nums[left] + nums[right];
                if (partSoFar == remPart) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left + 1 < right && nums[left] == nums[left + 1])
                        left++;
                    left++;
                    while (right - 1 > left && nums[right] == nums[right - 1])
                        right--;
                    right--;
                } else if (partSoFar < remPart)
                    left++;
                else
                    right--;

            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1])
                i++;
        }

        return result;

    }
}