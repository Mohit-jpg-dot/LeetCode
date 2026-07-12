class Solution {
    public int[] arrayRankTransform(int[] arr1) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = Arrays.copyOf(arr1, arr1.length);
        int[] res = new int[arr1.length];
        int j = 1;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],j++);
            }
        }
        for(int i = 0;i<arr.length;i++){
            res[i] = map.get(arr1[i]);
        }
        return res;
    }
}