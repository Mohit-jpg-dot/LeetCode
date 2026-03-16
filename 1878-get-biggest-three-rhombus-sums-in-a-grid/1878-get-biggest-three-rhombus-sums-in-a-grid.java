class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][] prefixSum = new int[n + 1][m + 1][2];
        TreeSet<Integer> q = new TreeSet<>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int cur = grid[i][j];
                if (q.contains(cur)) continue;
                if (q.size() < 3) q.add(cur);
                else {
                    int least = q.pollFirst();
                    if (least < cur) q.add(cur);
                    else q.add(least);
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (i > 0 && j > 0) prefixSum[i + 1][j + 1][0] = prefixSum[i][j][0] + grid[i][j];
                else prefixSum[i + 1][j + 1][0] = grid[i][j];
                if (i > 0 && j < m - 1) prefixSum[i + 1][j + 1][1] = prefixSum[i][j + 2][1] + grid[i][j];
                else prefixSum[i + 1][j + 1][1] = grid[i][j];
            }
        }
        for (int size = 2; size <= Math.min(n,m) / 2 + 1; ++size) {
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= m; ++j) {
                    int k = size - 1;
                    if (j + k > m || i + 2 * k > n || i + k > n || j - k - 1 < 0) continue;
                    int topRight = prefixSum[i + k][j + k][0] - prefixSum[i][j][0];
                    int bottomRight = prefixSum[i + 2 * k][j][1] - prefixSum[i + k][j + k][1];
                    int bottomLeft = prefixSum[i + 2 * k - 1][j - 1][0] - prefixSum[i + k - 1][j - k - 1][0];
                    int topLeft = prefixSum[i + k - 1][j - k + 1][1] - prefixSum[i - 1][j + 1][1]; 
                    int sum = topRight + bottomRight + bottomLeft + topLeft;
                    if (q.contains(sum)) continue;
                    if (q.size() < 3) q.add(sum);
                    else {
                        int least = q.pollFirst();
                        if (least < sum) q.add(sum);
                        else q.add(least);
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) list.add(q.pollFirst());
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) res[list.size() - i - 1] = list.get(i);
        return res;
    }
}