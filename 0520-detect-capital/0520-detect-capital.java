class Solution {
    public boolean detectCapitalUse(String word) {
        int small = 0,big = 0;
        for(char ch: word.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                small++;
            }
            else{
                big++;
            }
        }
        if(small == word.length() || big == word.length()){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && small == word.length()-1){
            return true;
        }
        return false;
    }
}