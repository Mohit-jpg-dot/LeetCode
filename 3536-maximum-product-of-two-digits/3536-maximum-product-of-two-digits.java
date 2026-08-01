class Solution {
    public int maxProduct(int n) {
        int ld1 = 0;
        int ld2 = 0;
        while(n!=0){
            if(ld1 < (n%10)){
                ld2 = ld1;
                ld1 = n%10;
            }
            else if(ld2 < (n%10)){
                ld2 = (n%10);
            }
            n /= 10;
        }
        return ld1*ld2;
    }
}