class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 1;
        for(int x:nums){
            if(x == k*i){
                i++;
            }
        }
        return k*i;
    }
}