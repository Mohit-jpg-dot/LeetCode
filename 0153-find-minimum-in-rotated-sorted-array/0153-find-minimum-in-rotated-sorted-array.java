class Solution {
    public int rotatedBinarySearch(int[] arr,int start,int end){
        if(arr[start] <= arr[end]){
            return arr[start];
        }
        int mid = start + (end-start)/2;
        if(arr[start] > arr[mid]){
            return rotatedBinarySearch(arr,start,mid);
        }
        return rotatedBinarySearch(arr,mid+1,end);
    }
    public int findMin(int[] nums) {
        return rotatedBinarySearch(nums,0,nums.length-1);
    }
}