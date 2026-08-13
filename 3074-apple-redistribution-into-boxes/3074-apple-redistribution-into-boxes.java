class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int cnt = 0;
        int j = capacity.length-1;
        int totalApples = 0;
        for(int x:apple){
            totalApples += x;
        }
        while(totalApples > 0){
            totalApples -= capacity[j];
            cnt++;
            j--;
        }
        return cnt;
    }
}