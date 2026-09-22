class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
       for(String s:sentences){
        int len = s.split(" ").length;
        maxLength = Math.max(maxLength,len);
       }
       return maxLength;
    }
}