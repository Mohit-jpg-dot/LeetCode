class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 0 && (i == 0 || nums[i-1]==0) && (i == nums.length - 1 || nums[i+1]==0)){
                nums[i] = 1;
                n--;
            }
            i++;
        }
        return (n<=0);
    }
}