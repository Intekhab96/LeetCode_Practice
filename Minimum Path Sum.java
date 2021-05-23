class Solution {
    public int minPathSum(int[][] grid) {

        int[][] dp = new int[grid.length][grid[0].length];

        int currentVal;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 || j == 0) {
                    if (i != 0)
                        dp[i][j] = grid[i][j] + dp[i - 1][j];
                    else if (j != 0)
                        dp[i][j] = grid[i][j] + dp[i][j - 1];
                    else
                        dp[i][j] = grid[i][j];
                } else {
                    currentVal = grid[i][j];
                    dp[i][j] = Math.min(currentVal + dp[i][j - 1], currentVal + dp[i - 1][j]);
                }

            }
        }

        // System.out.println(Arrays.deepToString(dp));

        return dp[dp.length - 1][dp[0].length - 1];

    }
}