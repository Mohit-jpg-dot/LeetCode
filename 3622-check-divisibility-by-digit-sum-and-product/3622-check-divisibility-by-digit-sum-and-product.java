class Solution {
    public boolean checkDivisibility(int n) {
        int product = 1;
        int sum = 0;
        int drum = n;
        while(n != 0){
            product *= n%10;
            sum += n%10; 
            n /= 10;
        }
        int res = sum + product;
        return (drum%res == 0);
    }
}