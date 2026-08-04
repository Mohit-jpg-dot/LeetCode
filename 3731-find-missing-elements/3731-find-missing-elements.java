class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            while(nums[i] > min){
                res.add(min);
                min++;
            }
            min++;
        }
        return res;
    }
}