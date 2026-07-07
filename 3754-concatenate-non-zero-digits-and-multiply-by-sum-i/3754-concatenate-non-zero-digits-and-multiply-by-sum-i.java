class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long num = 0;
        long realNum = 0;
        while(n!=0){
            if(n%10 != 0){
                num = num*10+n%10;
                sum += n%10;
            }
            n /= 10;
        }
        while(num!=0){
            realNum = realNum*10 + num%10;
            num /= 10;
        }
        return realNum*sum;
    }
}