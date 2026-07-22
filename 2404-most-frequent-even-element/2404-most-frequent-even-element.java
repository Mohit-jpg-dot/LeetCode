class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int maxCount = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x:map.keySet()){
            int count = map.get(x);
            if(x%2 == 0){
                if(count > maxCount){
                    maxCount = count;
                    min = x;
                }
                else if(count == maxCount){
                    if(min > x){
                        min = x;
                    }
                }
            }
        }
        return (min == Integer.MAX_VALUE)?-1:min;
    }
}