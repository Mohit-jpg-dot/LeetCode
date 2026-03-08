class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int idx = -1;
        int value = Integer.MAX_VALUE;
        for(int i = 0;i<capacity.length;i++){
            if(capacity[i] >= itemSize){
                if(capacity[i] < value){
                    idx = i;
                    value = capacity[i];
                }
            }
        }
        return idx;
    }
}