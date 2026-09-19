class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int i = 0; i < time.length; i++){
            int remain = time[i] % 60;
            int need = 60 - remain;

            if(map.containsKey(need)){
                ans +=  map.get(need);
            } 

            if(remain != 0){
                map.put(remain, map.getOrDefault(remain, 0) + 1);
            }
            else{
                map.put(60, map.getOrDefault(60, 0) + 1);
            }
        }

        return ans;
    }
}