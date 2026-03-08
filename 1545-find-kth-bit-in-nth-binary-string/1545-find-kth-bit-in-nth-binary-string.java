class Solution {
    public char findKthBit(int n, int k) {
        // StringBuilder sb = new StringBuilder("0");
        // make(sb, n);
        // return sb.charAt(k - 1);

        if(n == 1) return '0';
        int length = (1<<n) - 1;
        int mid = length/2 + 1;
        if(mid == k) return '1';
        else if(mid > k){
            return findKthBit(n-1,k);
        }
        else{
            char bitAtRight = findKthBit(n-1,length - k + 1);
            return (bitAtRight == '0')?'1':'0';
        }
    }

    // public void make(StringBuilder sb, int n) {
    //     if (n == 1) return;
    //     String prevInverted = reverseInvert(sb.toString());
    //     sb.append("1").append(prevInverted);
    //     make(sb, n - 1);
    // }

    // public String reverseInvert(String s) {
    //     StringBuilder res = new StringBuilder();
    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         res.append(s.charAt(i) == '0' ? '1' : '0');
    //     }
    //     return res.toString();
    // }
}









