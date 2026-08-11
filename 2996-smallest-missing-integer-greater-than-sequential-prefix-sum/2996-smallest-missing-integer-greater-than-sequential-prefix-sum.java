class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(i+1 < nums.length && nums[i] != nums[i+1]-1){
                sum += nums[i];
                break;
            }
            sum += nums[i];
        }
        for(int x:nums){
            set.add(x);
        }
        for(int x:set){
            if(!set.contains(sum)){
                return sum;
            }
            sum++;
        }
        return sum;
    }
}