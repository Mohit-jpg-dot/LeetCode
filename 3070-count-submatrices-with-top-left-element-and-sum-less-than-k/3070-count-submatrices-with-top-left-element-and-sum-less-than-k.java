class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int sum = 0,count = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                int top = (i>0)?grid[i-1][j]:0;
                int left = (j>0)?grid[i][j-1]:0;
                int diagonal = (i>0 && j>0)?grid[i-1][j-1]:0;
                grid[i][j] = grid[i][j] + top + left - diagonal;
                if(grid[i][j] <= k){ 
                    count++;
                }
            }
        }
        return count;
    }
}