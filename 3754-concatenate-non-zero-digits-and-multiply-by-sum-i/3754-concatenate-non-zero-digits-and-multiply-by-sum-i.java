class Solution {
    public int sumOfDigits(long n){
        int sum1 = 0;
        while(n!=0){
            sum1 += n%10;
            n/=10;
        }
        return sum1;
    }
    public long splitter(int n){
        StringBuilder sb = new StringBuilder();
        for(char x:String.valueOf(n).toCharArray()){
            int m = x - '0';
            if(m!=0){
                sb.append(m);
            }
        }
        if(sb.length() == 0) return 0;
        return Long.valueOf(sb.toString());
    }
    public long sumAndMultiply(int n) {
        long x = splitter(n);
        int sum = sumOfDigits(x);
        return x*sum;
    }
}