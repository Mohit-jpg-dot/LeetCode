class Solution {
    public int bitwiseComplement(int n) {
        int bitCount = Integer.toBinaryString(n).length();
        int mask = (1<<bitCount)-1;
        return n^mask;
    }
}