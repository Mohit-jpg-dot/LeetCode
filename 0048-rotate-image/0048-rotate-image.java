class Solution {
    public void rotate(int[][] matrix) {
    //First we have to take a transpose then we have to reverse each row//
        int row = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0;i<row;i++){
            for(int j = i+1;j<row;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<cols/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - j - 1];
                matrix[i][cols - j - 1] = temp;
            }
        }
    }
}