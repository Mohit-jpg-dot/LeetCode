class Solution {
    public int rotatedBinarySearch(int[] arr,int start,int end){
        if(start == end) return arr[start];
        if(arr[start] < arr[end]){
            return arr[start];
        }
        int mid = start + (end-start)/2;
        if(arr[start] > arr[mid]){
            return rotatedBinarySearch(arr,start,mid);
        }
        else if(arr[start] < arr[mid]) {
            return rotatedBinarySearch(arr,mid+1,end);
        }
        else{
            return rotatedBinarySearch(arr, start + 1, end);
        }
    }
    public int findMin(int[] nums) {
        // int min = Integer.MAX_VALUE;
        // for(int i = 0;i<nums.length;i++){
        //     if(min > nums[i]){
        //         min = nums[i];
        //     }
        // }
        // return min;
        return rotatedBinarySearch(nums,0,nums.length-1);
    }
}