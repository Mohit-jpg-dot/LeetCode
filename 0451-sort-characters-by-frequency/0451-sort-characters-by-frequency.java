class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int n = map.size();
        int[][] matrix = new int[n][2];
        int i = 0;
        for(char x:map.keySet()){
            matrix[i][0] = x;
            matrix[i][1] = map.get(x);
            i++;
        }
        Arrays.sort(matrix, (a, b) -> Integer.compare(b[1], a[1]));
        StringBuilder result = new StringBuilder();
        for(int j = 0;j<matrix.length;j++){
            result.append(Character.toString(matrix[j][0]).repeat(matrix[j][1]));
        }
        return result.toString();
    }
}