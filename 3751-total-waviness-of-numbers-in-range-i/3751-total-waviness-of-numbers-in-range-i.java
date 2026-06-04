class Solution {
    public int isPeak(String n){
        int count = 0;
        for(int i = 1;i<n.length()-1;i++){
            int a = n.charAt(i-1);
            int b = n.charAt(i);
            int c = n.charAt(i+1);
            if(a < b && b > c){
                count++;
            }
        }
        return (count == 0)?-1:count;
    }
    public int isValley(String n){
        int count = 0;
        for(int i = 1;i<n.length()-1;i++){
            int a = n.charAt(i-1);
            int b = n.charAt(i);
            int c = n.charAt(i+1);
            if(a > b && b < c){
                count++;
            }
        }
        return (count == 0)?-1:count;
    }

    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        for(int i = num1;i<=num2;i++){
            String num = String.valueOf(i);
            if(num.length() < 3){
                continue;
            }
            int v = isValley(num);
            if(v != -1){
                waviness += v;
            }
            int p = isPeak(num);
            if(p != -1){
                waviness += p;
            }
        }
        return waviness;
    }
}