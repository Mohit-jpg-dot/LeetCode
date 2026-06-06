class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] preffix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] ans = new int[nums.length];
        int prefix = 0;
        preffix[0] = 0;
        for(int i = 1;i<nums.length;i++){
            prefix += nums[i-1];
            preffix[i] = prefix;
        }
        int sufix = 0;
        suffix[nums.length - 1] = 0; 
        for(int i = nums.length - 2;i>=0;i--){
            sufix += nums[i + 1];
            suffix[i] = sufix;
        }
        for(int i = 0;i<nums.length;i++){
            ans[i] = Math.abs(preffix[i] - suffix[i]);
        }
        return ans;
    }
}