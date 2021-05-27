class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                result[0] = i;
                result[1] = hashMap.get(diff);
                return result;
            }
            hashMap.put(nums[i], i);
        }

        return result;
    }
}
