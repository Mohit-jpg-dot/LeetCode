class Solution {
    public int divide(int dividend, int divisor) {
        long res = 0;
        long a = dividend,b = divisor;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if(a < 0 && b < 0){
            a = -a;
            b = -b;
            res = a/b;
        }
        else if(a < 0){
            a = -a;
            res = -(a/b);
        }
        else if(b < 0){
            b = -b;
            res = -(a/b);
        }
        else{
            res = a/b;
        }
        return (int)res;
    }
}