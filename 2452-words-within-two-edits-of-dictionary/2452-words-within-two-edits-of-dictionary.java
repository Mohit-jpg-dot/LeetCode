class Solution {
    public int gatcha(String s1,String s2){
        int count = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ls = new ArrayList<>();
        for(int i = 0;i<queries.length;i++){
            for(int j = 0;j<dictionary.length;j++){
                int c = gatcha(queries[i],dictionary[j]);
                if(c <= 2){
                    ls.add(queries[i]);
                    break;
                }
            }
        }
        return ls;

    }
}