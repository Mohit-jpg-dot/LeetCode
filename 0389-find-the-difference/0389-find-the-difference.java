class Solution {
    public char findTheDifference(String s, String t) {
        char xorRes = 0;
        for(char x:t.toCharArray()){
            xorRes ^= x;
        }
        for(char x:s.toCharArray()){
            xorRes ^= x;
        }
        return xorRes;
    }
}