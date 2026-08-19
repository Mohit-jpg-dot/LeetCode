class Solution {
    public String makeFancyString(String s) {
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0;i<s.length();i++){
        //     sb.append(s.charAt(i));
        //     if(s.length() > i+2 && s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){
        //         sb.deleteCharAt(sb.length()-1);
        //     }
        // }
        // return sb.toString();

        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.length() > i+1 && s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }
            else{
                cnt = 1;
            }
            if(cnt <= 2){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}