class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i = 0;i<queries.length;i++){
            int idx = queries[i][0];
            while(idx <= queries[i][1]){
                nums[idx] = (int) (( (long) nums[idx] * queries[i][3] ) % 1000000007);
                idx += queries[i][2];
            }
        }
        long result = 0;
        for(int x:nums){
            result ^= x;
        }
        return (int)result;
    }
}