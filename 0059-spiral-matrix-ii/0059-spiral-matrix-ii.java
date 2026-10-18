class Solution {
    public int[][] generateMatrix(int n) {
        int c = 1;
        int left = 0,right = n-1;
        int top = 0,bottom = n-1;
        int[][] matrix = new int[n][n];
        while(left <= right && top <= bottom){
            for(int i = left;i<=right;i++){
                matrix[top][i] = c;
                c++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                matrix[i][right] = c;
                c++;
            }
            right--;
            if(left <= right){
            for(int i = right;i >= left;i--){
                matrix[bottom][i] = c;
                c++;
            }
            bottom--;
            }
            if(top <= bottom){
            for(int i = bottom;i >= top;i--){
                matrix[i][left] = c;
                c++;
            }
            left++;
            }
        }
        return matrix;
    }
}