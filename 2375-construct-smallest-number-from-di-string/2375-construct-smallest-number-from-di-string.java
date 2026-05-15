class Solution {
    public String smallestNumber(String pattern) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int j = 1;
        for(int i = 0;i<=pattern.length();i++){
            st.push(String.valueOf(j++));
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
            }
        }
        // while(!st.isEmpty()){
        //     sb.append(st.pop());
        // }
        return sb.toString();
    }
}