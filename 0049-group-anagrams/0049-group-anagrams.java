class Solution {
    public String kro(String a){
        char[] b = a.toCharArray();
        Arrays.sort(b);
        return new String(b);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            String key = kro(s);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}