class Solution {
    public int integerReplacement(int a) {
        long n = a;
        int cnt = 0;
        while(n!=1){
            if(n%2==0){
                n /= 2;
            }
            else{
                if(n == 3 || (n&2) == 0){ // here we are checking that whether (n&2) gives us the second bit as 0 or 1 because in order to minimize the operations if we got 0 then we do n-- becaue i will make the 00 zeroes and if the bit is 1 then ++ which gives us with 2 zeroes//
                    n--;
                }
                else{
                    n++;
                }
            }
            cnt++;
        }
        return cnt;
    }
}