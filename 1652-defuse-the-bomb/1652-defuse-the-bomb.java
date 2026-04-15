class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[code.length];
        for(int i = 0;i<code.length;i++){
            if(k == 0){
                ans[i] = 0;
            }
            else if(k > 0){
                int sum = 0;
                for(int c = 0;c<k;c++){
                    sum += code[(i+c+1)%n];
                }
                ans[i] = sum;
                sum = 0;
            }
            else {
                int sum = 0;
                for(int j = 1;j<=(-k);j++){
                    sum += code[(i-j+n)%n];
                }
                ans[i] = sum;
                sum = 0;
            }
        }
        return ans;
    }
}