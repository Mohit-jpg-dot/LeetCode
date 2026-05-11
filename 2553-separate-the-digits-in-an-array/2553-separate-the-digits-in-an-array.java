class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            String res = String.valueOf(nums[i]);
            if(res.length() <= 1){
                ls.add(nums[i]);
            }
            else{
                int j = 0;
                while(res.length() > j){
                    int n = res.charAt(j) - '0';
                    ls.add(n);
                    j++;
                }
            }
        }
        int n = ls.size();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }
}