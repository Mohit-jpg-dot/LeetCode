class Solution {

    static final int MOD = 1000000007;
    int[][][] memo;
    int limit;

    public int numberOfStableArrays(int zero, int one, int limit) {

        memo = new int[zero + 1][one + 1][2];

        // initialize memo with -1
        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {
                memo[i][j][0] = -1;
                memo[i][j][1] = -1;
            }
        }

        this.limit = limit;

        int startWithZero = dp(zero, one, 0);
        int startWithOne = dp(zero, one, 1);

        return (startWithZero + startWithOne) % MOD;
    }

    int dp(int zero, int one, int last) {

        if (zero == 0) {
            if (last == 0 || one > limit) return 0;
            return 1;
        }

        if (one == 0) {
            if (last == 1 || zero > limit) return 0;
            return 1;
        }

        if (memo[zero][one][last] != -1)
            return memo[zero][one][last];

        int ans = 0;

        if (last == 0) {

            ans = (dp(zero - 1, one, 0) + dp(zero - 1, one, 1)) % MOD;

            if (zero > limit) {
                ans = (ans - dp(zero - limit - 1, one, 1) + MOD) % MOD;
            }

        } else {

            ans = (dp(zero, one - 1, 0) + dp(zero, one - 1, 1)) % MOD;

            if (one > limit) {
                ans = (ans - dp(zero, one - limit - 1, 0) + MOD) % MOD;
            }
        }

        memo[zero][one][last] = ans;
        return ans;
    }
}