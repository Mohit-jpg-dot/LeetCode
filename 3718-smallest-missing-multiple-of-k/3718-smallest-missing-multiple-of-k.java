class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            if(x%k == 0){
                set.add(x);
            }
        }
        for(int i = 1;i<=set.size()+1;i++){
            if(!set.contains(i*k)){
                return k*i;
            }
        }
        return 0;
    }
}