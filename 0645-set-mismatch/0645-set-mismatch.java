class Solution {
    public int[] findErrorNums(int[] nums) {
        int xorArray = 0;
        int xorAll = 0;
        for(int x:nums){
            xorArray ^= x;
        }
        for(int i = 1;i<=nums.length;i++){
            xorAll ^= i;
        }
        int xorResult = xorArray ^ xorAll;
        int rightMostBit = (xorResult & -xorResult);
        int xorSet = 0;
        int xorNotSet = 0;
        for(int i = 1;i<=nums.length;i++){
            if((rightMostBit&i) != 0){
                xorSet ^= i;
            }
            else{
                xorNotSet ^= i;
            }
        }
        for(int x:nums){
            if((x&rightMostBit) != 0){
                xorSet ^= x;
            }
            else{
                xorNotSet ^= x;
            }
        }
        for(int x:nums){
            if(x == xorSet){
                return new int[] {xorSet,xorNotSet};
            }
        }
        return new int[] {xorNotSet,xorSet};
    }
}