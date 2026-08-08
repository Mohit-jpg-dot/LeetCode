class Solution {
    public int findFirst(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int first = 0;
        int last = arr.length - 1;
        int res = -1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                res = mid;
                last = mid - 1;   
            }
            else if (arr[mid] > target) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }

        return res;
    }

    public int findLast(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int first = 0;
        int last = arr.length - 1;
        int res = -1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                res = mid;
                first = mid + 1;  
            }
            else if (arr[mid] > target) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            findFirst(nums, target),
            findLast(nums, target)
        };
    }
}