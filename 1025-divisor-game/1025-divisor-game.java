class Solution {
    public boolean divisorGame(int n) {
        // int i = 1,j = 0;
        // int temp = n;
        // while(true){
        //     if(n >= temp){
        //         break;
        //     }
        //     if(n%n-i == 0){
        //         n = n - i;
        //         j++;
        //     }
        //     i++;
        // }
        // return j%2 != 0;

        return n%2 == 0;
    }
}