class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] prefix = new int[rows*cols];
        int[] suffix = new int[rows*cols];
        int[][] res = new int[rows][cols];
        int[] arr = new int[rows*cols];
        int p = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                arr[p] = grid[i][j];
                p++;
            }
        }
        long prefixx = 1,suffixx = 1;
        for(int i = 0;i<arr.length;i++){
            prefix[i] = (int)prefixx;
            prefixx = (prefixx*arr[i])%12345;
        }

        for(int i = arr.length - 1;i>=0;i--){
            suffix[i] = (int)suffixx;
            suffixx = (suffixx*arr[i])%12345; 
        }
        int c = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                res[i][j] = (int)(((long)prefix[c]*suffix[c])%12345);
                c++;
            }        }
        return res;
    }
}