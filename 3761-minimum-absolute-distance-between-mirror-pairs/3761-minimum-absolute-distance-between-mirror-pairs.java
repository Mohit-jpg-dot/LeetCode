class Solution {
    public int reverse(int n){
        int sign = (n < 0)?0:1;
        int res = 0;
        n = Math.abs(n);
        while(n > 0){
            res = res*10 + n%10;
            n /= 10;
        }
        return sign == 0?res*(-1):res;
    }
    public int minMirrorPairDistance(int[] nums) {
        int result = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                result = Math.min(result,Math.abs(i-map.get(nums[i])));
            }
            int rev = reverse(nums[i]);
            map.put(rev,i);
        }
        return (result == Integer.MAX_VALUE)?-1:result;
    }
}