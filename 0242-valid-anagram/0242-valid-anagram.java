class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // Set<Character> set = new HashSet<>();
        // for(char x:s.toCharArray()){
        //     if(set.add(x));
        // }
        // for(char x:t.toCharArray()){
        //     if(set.add(x) == true){
        //         return false;
        //     }
        // }
        // return true;
        // if(s.length()!=t.length()) return false;
        // Map<Character,Integer> map = new TreeMap<>();
        // for(char x:s.toCharArray()){
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }
        // for(int i = 0;i<t.length();i++){
        //     char ch = t.charAt(i);
        //     if(map.containsKey(ch)){
        //         if(map.get(ch)!=0){
        //             map.put(ch,map.get(ch)-1);
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;

        if(s.length()!=t.length()) return false;
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            freq[ch1 - 'a'] += 1;
            freq[ch2 - 'a'] -= 1;
        }
        for(int x:freq){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}