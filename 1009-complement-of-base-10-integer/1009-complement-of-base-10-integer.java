class Solution {
    public int bitwiseComplement(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<bin.length();i++){
            if(bin.charAt(i) == '1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        return Integer.valueOf(sb.toString(),2);
    }
}