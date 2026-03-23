class Solution {
    private Long[][][] memo;

    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        memo = new Long[m][n][2];

        long[] ans = dfs(grid, 0, 0);
        return ans[0] < 0 ? -1 : (int) (ans[0] % 1000000007);
    }

    long[] dfs(int[][] grid, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;

        if (memo[x][y][0] != null) {
            return new long[] { memo[x][y][0], memo[x][y][1] };
        }

        if (x == n - 1 && y == m - 1) {
            long val = grid[x][y];
            memo[x][y][0] = val;
            memo[x][y][1] = val;
            return new long[] { val, val };
        }

        long maxProduct = Long.MIN_VALUE;
        long minProduct = Long.MAX_VALUE;

        if (y + 1 < m) {
            long[] right = dfs(grid, x, y + 1);
            long val1 = grid[x][y] * right[0];
            long val2 = grid[x][y] * right[1];
            maxProduct = Math.max(maxProduct, Math.max(val1, val2));
            minProduct = Math.min(minProduct, Math.min(val1, val2));
        }

        if (x + 1 < n) {
            long[] down = dfs(grid, x + 1, y);
            long val1 = grid[x][y] * down[0];
            long val2 = grid[x][y] * down[1];
            maxProduct = Math.max(maxProduct, Math.max(val1, val2));
            minProduct = Math.min(minProduct, Math.min(val1, val2));
        }

        memo[x][y][0] = maxProduct;
        memo[x][y][1] = minProduct;

        return new long[] { maxProduct, minProduct };
    }
}