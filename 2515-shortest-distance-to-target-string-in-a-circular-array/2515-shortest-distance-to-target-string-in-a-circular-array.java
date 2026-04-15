class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        for(int i = 0;i<words.length;i++){
            String left = words[(startIndex - i+n)%n];
            String right = words[(startIndex + i )%n];
            if(left.equals(target) || right.equals(target)){
                return i;
            }
        }
      return -1;  
    }
}