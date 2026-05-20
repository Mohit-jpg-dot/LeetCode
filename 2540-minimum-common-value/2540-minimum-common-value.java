class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Set<Integer> set1 = new LinkedHashSet<>();
        // Set<Integer> set2 = new LinkedHashSet<>();
        // for(int i = 0;i<nums1.length;i++){
        //     set1.add(nums1[i]);
        // }
        // for(int i = 0;i<nums2.length;i++){
        //     set2.add(nums2[i]);
        // }
        // for(int x:set2){
        //     if(!set1.add(x)){
        //         return x;
        //     }
        // }
        // return -1;
        
        int i = 0,j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] != nums2[j]){
                if(nums1[i] > nums2[j]){
                    j++;
                }
                else{
                    i++;
                }
            }
            else{
                return nums1[i];
            }
        }
        return -1;
    }
}