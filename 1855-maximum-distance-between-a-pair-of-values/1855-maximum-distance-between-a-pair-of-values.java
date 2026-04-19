class Solution {
    public int search(int target,int[] arr){
        int left = 0,right = arr.length - 1,ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] >= target){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxico = 0;
        for(int i = 0;i<nums1.length;i++){
            int j = search(nums1[i],nums2);
            if(j!=-1 && j>=i){
                maxico = Math.max(maxico,j - i);
            }
        }
        return maxico;
    }
}