class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i]) && Math.abs(hashMap.get(nums[i]) - i) <= k)
                return true;
            else {
                hashMap.put(nums[i], i);
            }
        }

        return false;
    }
}