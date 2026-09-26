class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder result = new StringBuilder();
        Map<String,String> map = new HashMap<>();
        for(int i = 0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        String key = "";
        Boolean bracket = false;
        for(char x:s.toCharArray()){
            if(x == '('){
                bracket = true;
            }
            else if(x == ')'){
                bracket = false;
                if(map.containsKey(key)){
                    result.append(map.get(key));
                }
                else{
                    result.append('?');
                }
                key = "";
            }
            else{
                if(bracket){
                    key += x;
                }
                else{
                    result.append(x);
                }
            }
        }
        return result.toString();
    }
}