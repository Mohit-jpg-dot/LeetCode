class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        int j = 0;
        for(int x:map.keySet()){
            names[j] = map.get(x);
            j++;
        }
        return names;
    }
}