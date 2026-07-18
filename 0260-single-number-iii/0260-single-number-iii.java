class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2) return nums;
        int xorAll = 0;
        for(int x:nums){
            xorAll ^= x;
        }
        int rightMostBit = xorAll & -xorAll;
        int xorSet = 0;
        int xorNotSet = 0;
        for(int x:nums){
            if((x&rightMostBit) != 0){
                xorSet ^= x;
            }
            else{
                xorNotSet ^= x;
            }
        }
        return new int[] {xorSet,xorNotSet};
    }
}