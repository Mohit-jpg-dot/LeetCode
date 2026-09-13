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
            if(freq >= 3){
                int n = map.get(x).get(1) - map.get(x).get(0);
                Boolean isNotSpecial = false;
                for(int j = 1;j<freq;j++){
                    int diff = map.get(x).get(j) - map.get(x).get(j-1);
                    if(diff != n){
                        isNotSpecial = true;
                        break;
                    }
                }
                if(!isNotSpecial){
                    count++;
                }
            }
        }
        return count;
    }
}