class Solution {
    public String makeFancyString(String s) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(s.length() > i+2 && s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}