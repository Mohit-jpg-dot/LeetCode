class Solution {
    public int hammingDistance(int x, int y) {
        String bin1 = String.format("%32s",Integer.toBinaryString(x)).replace(' ','0');
        String bin2 = String.format("%32s",Integer.toBinaryString(y)).replace(' ','0');
        int count = 0;
        for(int i = 0;i<32;i++){
            if(bin1.charAt(i) != bin2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}