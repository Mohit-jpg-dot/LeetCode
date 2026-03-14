class Solution {
    public int numSpecial(int[][] mat) {
        int spos = 0;
        int row = mat.length;
        int column = mat[0].length;
        int[] rowMatrix = new int[row];
        int[] columnMatrix = new int[column];
        for(int i = 0;i<row;i++){
            int count = 0;
            for(int j = 0;j<column;j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            rowMatrix[i] = count;
        }
        for(int i = 0;i<column;i++){
            int count = 0;
            for(int j = 0;j<row;j++){
                if(mat[j][i] == 1){
                    count++;
                }
            }
            columnMatrix[i] = count;
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(mat[i][j] == 1 && rowMatrix[i] == 1 && columnMatrix[j] == 1){
                    spos++;
                }
            }
        }
        return spos;
    }
}