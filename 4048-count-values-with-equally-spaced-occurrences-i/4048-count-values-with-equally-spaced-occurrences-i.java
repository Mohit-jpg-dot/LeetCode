class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0;
        Map<Integer,List<Integer>> map = new HashMap<>();
        int i = 0;
        for(int x:nums){
            if(!map.containsKey(x)){
                map.put(x,new ArrayList<>());
            }
            map.get(x).add(i);
            i++;
        }
        for(int x:map.keySet()){
            int freq = map.get(x).size();
            if(freq == 3 && (map.get(x).get(1) - map.get(x).get(0)) == (map.get(x).get(2) - map.get(x).get(1))){
                count++;
            }
        }
        return count;
    }
}