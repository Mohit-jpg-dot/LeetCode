class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] small = new boolean[26];
        boolean[] big = new boolean[26];
        for(char ch : word.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                small[ch - 'a'] = true;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                big[ch - 'A'] = true;
            }
            else{
                small[ch - 'a'] = false;
                big[ch - 'A'] = false;
            }
        }
        int count = 0;
        for(int i = 0;i<26;i++){
            if(small[i] && big[i]){
                count++;
            }
        }
        return count;
    }
}