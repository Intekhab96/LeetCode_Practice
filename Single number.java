class Solution {
    private int result = -1;

    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        hashMap.forEach((k, v) -> {
            if (v == 1)
                result = k.intValue();
        });

        return result;
    }
}