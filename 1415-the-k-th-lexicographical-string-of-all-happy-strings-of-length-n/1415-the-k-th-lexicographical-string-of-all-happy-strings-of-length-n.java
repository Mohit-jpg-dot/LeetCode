class Solution {
    private static final char[] CHARS = new char[]{'a', 'b', 'c'};
    private static final char[] NEXT_A = new char[]{'b', 'c'};
    private static final char[] NEXT_B = new char[]{'a', 'c'};
    private static final char[] NEXT_C = new char[]{'a', 'b'};

    public String getHappyString(int n, int k) {
        int total = 3 * (int)Math.pow(2, n - 1);
        if (k > total) {
            return "";
        }
        total = total / 3;
        var s = new StringBuilder();
        int i = 0;
        char prevChar = '#'; // denotes empty
        while (i < n) {
            int index = (k - 1) / total;
            char toAppend = getNextChars(prevChar)[index];
            s.append(toAppend);
            prevChar = toAppend;
            k -= (total * index);
            total /= 2;
            i++;
        }
        return s.toString();
    }

    private char[] getNextChars(char prevChar) {
        switch(prevChar) {
            case 'a': return NEXT_A;
            case 'b': return NEXT_B;
            case 'c': return NEXT_C;
            default: return CHARS;
        }
    }
}