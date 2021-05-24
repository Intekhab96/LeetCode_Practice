class Solution {
    private int result = -1;

    public int findJudge(int n, int[][] trust) {

        if (n == 1)
            return 1;

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Boolean> trustMap = new HashMap<Integer, Boolean>();

        for (int i = 1; i <= n; i++) {
            hashMap.put(i, 0);
            trustMap.put(i, false);
        }

        for (int i = 0; i < trust.length; i++) {
            hashMap.put(trust[i][1], hashMap.get(trust[i][1]) + 1);
            trustMap.put(trust[i][0], true);
        }

        hashMap.forEach((key, value) -> {
            if (value == n - 1 && !trustMap.get(key))
                result = key.intValue();
        });

        return result;

    }
}