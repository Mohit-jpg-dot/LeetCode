class Solution {
    public int gcd(int i,int j){
        if(j == 0) return i;
        return gcd(j,i%j);
    }
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x:nums){
            max = Math.max(max,x);
            min = Math.min(min,x);
        }
        return gcd(min,max);
    }
}