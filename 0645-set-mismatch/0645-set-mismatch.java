


class Solution {
    public int[] findErrorNums(int[] nums) {
        // int n = nums.length;
        // int xorAll = 0;
        // int xorArray = 0;

        // for (int i = 1; i <= n; i++) {
        //     xorAll ^= i;
        // }

        // for (int num : nums) {
        //     xorArray ^= num;
        // }

        // int xorResult = xorArray ^ xorAll;

        // int rightmostSetBit = xorResult & -xorResult;

        // int xorSet = 0;
        // int xorNotSet = 0;

        // for (int i = 1; i <= n; i++) {
        //     if ((i & rightmostSetBit) != 0) {
        //         xorSet ^= i;
        //     } else {
        //         xorNotSet ^= i;
        //     }
        // }
        // for (int num : nums) {
        //     if ((num & rightmostSetBit) != 0) {
        //         xorSet ^= num;
        //     } else {
        //         xorNotSet ^= num;
        //     }
        // }
        // for (int num : nums) {
        //     if (num == xorSet) {
        //         return new int[]{xorSet, xorNotSet};
        //     }
        // }
        // return new int[]{xorNotSet, xorSet};


        // int n = nums.length;
        // int expected=(n*(n+1))/2;
        // int missing = 0;
        // int actual = 0;
        // Set<Integer> set = new HashSet<>();
        // for(int x:nums){
        //     if(set.add(x) == false){
        //         missing = x;
        //     }
        //     else{
        //         actual += x;
        //     }
        // }
        // return new int[]{missing,expected - actual};
        
        return soln(nums);
    }
        private static int[] soln(int[] nums) {
        int[] ans = new int[2];
        int toalSum = (nums.length * (nums.length + 1)) / 2;
        int currentSum = 0;

        for (int j : nums) {
            int absValue = Math.abs(j);
            int index = absValue - 1;
            if (nums[index] < 0) {
                ans[0] = absValue;
            } else {
                nums[index] = nums[index] * -1;
            }
            currentSum = currentSum + absValue;
        }

        ans[1] = (toalSum - currentSum) + ans[0];
        return ans;
    }
}


