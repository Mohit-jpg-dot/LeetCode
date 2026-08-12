class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0,cnt = 0,maxlen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            cnt++;
            while(map.get(x) > k){
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
                cnt--;
            }
            maxlen = Math.max(maxlen,cnt);
        }
        return maxlen;
    }
}