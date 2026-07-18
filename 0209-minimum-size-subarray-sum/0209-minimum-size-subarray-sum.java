class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0;right<nums.length;right++){
            sum += nums[right];
            while(sum >= target){
                minLength = Math.min(minLength,right - left+1);
                sum -= nums[left];
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE)?0:minLength;
        // int n = nums.length;
        // int sum = 0;
        // Arrays.sort(nums);
        // for(int i = nums.length-1;i>=0;i--){
        //     sum += nums[i];
        //     if(sum >= target){
        //         return n - i;
        //     }
        // }
        // return 0;
    }
}