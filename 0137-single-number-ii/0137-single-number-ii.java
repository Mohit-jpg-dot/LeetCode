class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int bit = 0;bit<32;bit++){
            int count = 0;
            for(int x:nums){
                if(((x>>bit) & 1) == 1){
                    count++;
                }
            }
            if(count%3 != 0){
                res |= (1<<bit);
            }
        }
        return res;
    }
}