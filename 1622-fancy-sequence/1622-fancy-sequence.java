class Fancy {
    ArrayList<Long> arr;
    int mod = 1000000007;
    long add = 0;
    long multi = 1;

    public Fancy() {
        arr = new ArrayList<>();
    }
    
    public void append(int val) {
        long adjusted = (val - add + mod) % mod;
        adjusted = (adjusted * modInverse(multi)) % mod;
        arr.add(adjusted);
    }
    
    public void addAll(int inc) {
        add = (add+inc)%mod;
    }
    
    public void multAll(int m) {
        multi = (multi * m) % mod;
        add = (add * m) % mod;
    }
    
    public int getIndex(int idx) {
         if (idx >= arr.size()) return -1;

        long val = arr.get(idx);
        return (int)((val * multi + add) % mod);
    }
    private long modInverse(long x) {
        return pow(x, mod - 2);
    }

    private long pow(long a, long b) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}

