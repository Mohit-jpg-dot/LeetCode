// class Solution {
//     public String decodeCiphertext(String encodedText, int rows) {
//         int n = encodedText.length();
//         int cols = n/rows;
//         char[][] matrix = new char[rows][cols];
//         int c = 0;
//         for(int i = 0;i<rows;i++){
//             for(int j = 0;j<cols;j++){
//                 matrix[i][j] = encodedText.charAt(c++);
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         for(int i = 0;i<cols;i++){
//             int j = 0,k=i;
//             while(j<rows && k<cols){
//                 result.append(matrix[j++][k++]);
//             }
//         }
//         int end = result.length()-1;
//         while(end >= 0 && result.charAt(end) == ' '){
//             end--;
//         }
//         return result.substring(0,end+1);
//     }
// }


class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1)
            return encodedText;
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder res = new StringBuilder(n);
        for (int c = 0; c < cols; c++) {
            int r = 0, j = c;
            while (r < rows && j < cols) {
                res.append(encodedText.charAt(r * cols + j));
                r++;
                j++;
            }
        }
        int end = res.length() - 1;
        while (end >= 0 && res.charAt(end) == ' ') {
            end--;
        }
        return res.substring(0, end + 1);
    }
}