class Solution {
    public char findTheDifference(String s, String t) {
        char xorRes = 0;
        for(int i = 0;i<t.length();i++){
            xorRes ^= t.charAt(i);
        }
        for(int i = 0;i<s.length();i++){
            xorRes ^= s.charAt(i);
        }
        return xorRes;
    }
}