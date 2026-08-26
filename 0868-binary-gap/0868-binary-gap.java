class Solution {
    public int binaryGap(int n) {
        if((n&(n-1)) == 0) return 0;
        int cnt = Integer.numberOfTrailingZeros(n),maxCnt = 0,gap = 0;
        n = n>>cnt;
        while(n!=0){
            if((n&1) == 1){
                maxCnt = Math.max(maxCnt,gap);
                gap = 0;
            }
            gap++;
            n >>= 1;
        }
        return maxCnt;
    }
}