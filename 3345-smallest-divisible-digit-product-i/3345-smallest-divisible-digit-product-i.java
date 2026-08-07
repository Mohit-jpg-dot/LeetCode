class Solution {
    public boolean isDivisible(int n,int t){
        if(n%10 == 0) return true;
        int product = 1;
        while(n!=0){
            product *= n%10;
            n /= 10;
        }
        return (product%t == 0);
    }
    public int smallestNumber(int n, int t) {
        while(!isDivisible(n,t)){
            n++;
        }
        return n;
    }
}