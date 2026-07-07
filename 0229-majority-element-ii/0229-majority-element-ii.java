class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0,candidate2 = 0;
        int count1 = 0,count2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(candidate1 == nums[i]){
                count1++;
            }
            else if(candidate2 == nums[i]){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                candidate2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        int count3 = 0,count4 = 0;
        for(int x:nums){
            if(x == candidate1) count3++;
            else if(x == candidate2) count4++;
        }
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        if(count3 > n/3){
            list.add(candidate1);
        }
        if(count4 > n/3){
            list.add(candidate2);
        }
        return list;
    }
}