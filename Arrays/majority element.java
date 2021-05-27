class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1 || nums.length == 2)
            return nums[0];

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (hashMap.containsKey(i) && hashMap.get(i) + 1 > nums.length / 2)
                return i;
            else
                hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        return -1;

    }
}