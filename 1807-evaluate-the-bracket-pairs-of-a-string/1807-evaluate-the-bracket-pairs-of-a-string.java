class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder result = new StringBuilder();
        Map<String,String> map = new HashMap<>();
        for(List<String> list:knowledge){
            map.put(list.get(0),list.get(1));
        }
        StringBuilder key = new StringBuilder();
        Boolean bracket = false;
        for(char x:s.toCharArray()){
            if(x == '('){
                bracket = true;
            }
            else if(x == ')'){
                bracket = false;
                if(map.containsKey(key.toString())){
                    result.append(map.get(key.toString()));
                }
                else{
                    result.append('?');
                }
                key.setLength(0);
            }
            else{
                if(bracket){
                    key.append(x);
                }
                else{
                    result.append(x);
                }
            }
        }
        return result.toString();
    }
}