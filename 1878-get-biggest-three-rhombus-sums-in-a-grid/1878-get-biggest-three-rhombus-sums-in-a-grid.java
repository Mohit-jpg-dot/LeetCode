class Solution {

    private int find(int[][] grid, int i, int j, int k) {
        int n = grid.length;
        int m = grid[0].length;

        // check bounds
        if(i + 2*k >= n || j - k < 0 || j + k >= m) return -1;

        int sum = 0;

        int r = i;
        int c = j;

        // top -> left
        for(int t = 0; t < k; t++) {
            sum += grid[r][c];
            r++;
            c--;
        }

        // left -> bottom
        for(int t = 0; t < k; t++) {
            sum += grid[r][c];
            r++;
            c++;
        }

        // bottom -> right
        for(int t = 0; t < k; t++) {
            sum += grid[r][c];
            r--;
            c++;
        }

        // right -> top
        for(int t = 0; t < k; t++) {
            sum += grid[r][c];
            r--;
            c--;
        }

        return sum;
    }

    public int[] getBiggestThree(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {

                // single cell rhombus
                if(set.add(grid[i][j])) {
                    pq.add(grid[i][j]);
                    if(pq.size() > 3) pq.remove();
                }

                for(int k = 1; k < Math.min(row, col); k++) {

                    int val = find(grid, i, j, k);
                    if(val == -1) break;

                    if(set.add(val)) {
                        pq.add(val);
                        if(pq.size() > 3) pq.remove();
                    }
                }
            }
        }

        int n = pq.size();
        int[] ans = new int[n];

        for(int i = n-1; i >= 0; i--) {
            ans[i] = pq.remove();
        }

        return ans;
    }
}