class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        // int left = 0,right = 0;
        // for(char x : moves.toCharArray()){
        //     if(x == 'L') left++;
        //     else if(x == 'R') right++;
        // }
        // int result = 0;
        // for(char x : moves.toCharArray()){
        //     if(x == 'L') result--;
        //     else if(x == 'R') result++;
        //     else{
        //         if(left > right) result--;
        //         else result++;
        //     }
        // }
        // return Math.abs(result);

        int left = 0,right = 0,underscore = 0;
        for(char x:moves.toCharArray()){
            if(x == 'L') left++;
            else if(x == 'R') right++;
            else underscore++;
        }
        return Math.max(left,right) - Math.min(left,right) + underscore;
    }
}