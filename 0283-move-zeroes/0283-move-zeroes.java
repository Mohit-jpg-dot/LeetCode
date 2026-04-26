class Solution {
    public void moveZeroes(int[] nums) {
        // int i = 0;
        // int n = nums.length;
        // while(n > i){
        //     if(nums[i]==0){
        //         for(int j = i+1;j<n;j++){
        //             if(nums[j]!=0){
        //                 int temp = nums[i];
        //                 nums[i] = nums[j];
        //                 nums[j] = temp;
        //                 break;
        //             }
        //         }
        //     }
        //     i++;
        // }
        int idx = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[idx++] = nums[i]; 
            }
        }
        while(idx < nums.length){
            nums[idx++] = 0;
        }
    }
}