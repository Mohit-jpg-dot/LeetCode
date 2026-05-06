class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int row = boxGrid.length;
        int cols = boxGrid[0].length;
        char[][] result = new char[row][cols];
        for(int i = 0;i<row;i++){
            for(int l = 0;l<cols;l++){
                result[i][l] = '.';
            }
            int o = cols-1;
            for(int j = cols-1;j>=0;j--){
                if(boxGrid[i][j] != '*'){
                    if(boxGrid[i][j] == '#'){
                        result[i][o--] = '#';
                    }
                }
                else{
                    result[i][j] = '*';
                    o = j - 1;
                }
            }
        }
        char[][] asli_result = new char[cols][row];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<cols;j++){
                asli_result[j][row-1-i] = result[i][j];
            }
        }
        return asli_result;
    }
}