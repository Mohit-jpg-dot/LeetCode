class Solution {
public:
    int minBitFlips(int start, int goal) {
        // int count = 0;
        // for(int i = 0;i<32;i++){
        //     if((goal&1) != (start&1)){
        //         count++;
        //     }
        //     goal >>= 1;
        //     start >>= 1;
        // }
        // return count;

        int count = 0;
        int n = start^goal;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
};