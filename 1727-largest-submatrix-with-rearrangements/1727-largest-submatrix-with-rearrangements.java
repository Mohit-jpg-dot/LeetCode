class Solution {
    // public int[] reverseSort(int[] arr){
    //     Arrays.sort(arr);
    //     for(int i = 0;i<arr.length/2;i++){
    //         int temp = arr[i];
    //         arr[i] = arr[arr.length - 1 - i];
    //         arr[arr.length - i - 1] = temp;
    //     }
    //     return arr;
    // }
    public int largestSubmatrix(int[][] matrix) {
        // int maxlen = 0;
        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // int max_ones = 0;
        // for(int i = 0;i<cols;i++){
        //     for(int i = 0;i<rows;i++){
        //         if(matrix[j][i] == 1){
        //             maxones++;
        //         }
        //     }
        //     maxlen = Math.max(maxones,maxlen);
        // }
        // return maxlen;

        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 1;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }
        int maxlen = 0;
        for(int i = 0;i<rows;i++){
            int[] row = matrix[i].clone();
            Arrays.sort(row);
            for(int j = cols - 1;j>=0;j--){
                int height = row[j];
                int width = cols - j;
                maxlen = Math.max(maxlen,height*width);
            }
        }
        return maxlen;
    }
}