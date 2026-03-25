class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                sum += grid[i][j];
            }
        }
        long rowSum = 0;
        for(int i = 0;i<rows-1;i++){
            for(int j = 0;j<cols;j++){
                rowSum += grid[i][j];
            }
            if(sum == 2*rowSum) return true;
        }
        long colSum = 0;
        for(int i = 0;i<cols-1;i++){
            for(int j = 0;j<rows;j++){
                colSum += grid[j][i];
            }
            if(sum == 2*colSum) return true;
        }
        return false;
    }
}