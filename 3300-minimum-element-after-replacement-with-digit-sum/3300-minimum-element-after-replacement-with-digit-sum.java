class Solution {
    public int digitSum(int n){
        int result = 0;
        String res = String.valueOf(n);
        for(char x:res.toCharArray()){
            result += x - '0';
        }
        return result;
    }
    public int minElement(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            String str = String.valueOf(nums[i]);
            if(str.length() > 1){
                nums[i] = digitSum(nums[i]);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int x:nums){
            min = Math.min(min,x);
        }
        return min;
    }
}