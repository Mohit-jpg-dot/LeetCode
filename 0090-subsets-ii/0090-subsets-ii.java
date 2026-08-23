class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int mask = 0; mask < (1 << nums.length); mask++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((mask & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            set.add(list);
        }
        return new ArrayList<>(set);
    }
}