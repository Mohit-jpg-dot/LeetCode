class Solution {
    public String findDifferentBinaryString(String[] nums) {
       Set<Integer> set = new HashSet<>();
       int n = nums[0].length();
       for(String m:nums){
        set.add(Integer.valueOf(m,2));
       }
       for(int i = 0;i<=n;i++){
        if(set.add(i)){
            String res = Integer.toBinaryString(i);
            while(n > res.length()){
                res = '0'+res;
            }
            return res;
        }
       }
       return "";
    }
}