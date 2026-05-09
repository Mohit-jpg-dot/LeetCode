class Solution {
    public static int rotatedBinarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){

            if(target >= arr[start] && target < arr[mid]){
                return rotatedBinarySearch(arr, target, start, mid - 1);
            }
            else{
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }
        else{

            if(target > arr[mid] && target <= arr[end]){
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
            else{
                return rotatedBinarySearch(arr, target, start, mid - 1);
            }
        }
    }

    public int search(int[] nums, int target) {
        return rotatedBinarySearch(nums, target, 0, nums.length - 1);
    }
}