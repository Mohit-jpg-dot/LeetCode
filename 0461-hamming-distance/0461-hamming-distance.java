class Solution {
    public int hammingDistance(int x, int y) {
        int cnt = 0,i = 0;
        while(i < 32){
            if((x&1) != (y&1)){
                cnt++;
            }
            x >>= 1;
            y >>= 1;
            i++;
        }
        return cnt;
    }
}