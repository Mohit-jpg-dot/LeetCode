class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int mid = nums.length/2;
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return map.get(nums[mid]) == 1;
    }
}