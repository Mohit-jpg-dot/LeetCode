class Solution {
    public int minimumPushes(String A) {
        if(A.length() < 8){
            return A.length();
        }
        int result = 0;
        int i = 1;
        int n = A.length()/8;
        while(n-- > 0){
            result += 8*i;
            i++;
        }
        if(A.length()%8 != 0){
            result += i*(A.length()%8);
        }
        return result;
    }
}