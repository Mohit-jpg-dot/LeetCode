class Solution {
    public int maxDistance(int[] colors) {
        int ans = 0;
        for(int i = 0;i<colors.length;i++){
            int j = colors.length - i - 1;
            if(colors[i]!=colors[0]){
                ans = Math.max(ans,i);
            }
            if(colors[i] != colors[colors.length - 1]){
                ans = Math.max(ans,j);
            }
        }
        return ans;
    }
}