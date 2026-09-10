class Solution {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            // s -> t mapping already exists
            if (map1.containsKey(a) && map1.get(a) != b) {
                return false;
            }

            // t -> s mapping already exists
            if (map2.containsKey(b) && map2.get(b) != a) {
                return false;
            }

            map1.put(a, b);
            map2.put(b, a);
        }

        return true;
    }
}