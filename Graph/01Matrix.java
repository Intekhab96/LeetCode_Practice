class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if (mat == null || mat.length == 0)
            return mat;
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[] { i, j });
                    visited[i][j] = true;
                }
            }
        }

        final int[][] dirs = { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int currX = curr[0];
                int currY = curr[1];
                for (int[] dir : dirs) {
                    int x = currX + dir[0];
                    int y = currY + dir[1];
                    if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y])
                        continue;
                    mat[x][y] = mat[currX][currY] + 1;
                    q.offer(new int[] { x, y });
                    visited[x][y] = true;
                }
            }
        }

        return mat;
    }

}