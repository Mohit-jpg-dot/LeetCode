class Solution {
    public String compressedString(String word) {
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            int count = 0;
            while(i<word.length() && word.charAt(i) == ch){
                count++;
                i++;
                if(count == 9){
                    res.append(count);
                    res.append(ch);
                    count = 0;
                }
            }
            i--;
            if(count!=0){
                res.append(count);
                res.append(ch);
            }
        }
        return res.toString();
    }
}