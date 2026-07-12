class Solution {
    public int[] arrayRankTransform(int[] arr1) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = Arrays.stream(arr1).sorted().toArray();
        int[] res = new int[arr.length];
        Arrays.sort(arr);
        int j = 1;
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]));
            }
            else{
                map.put(arr[i],j++);
            }
        }
        for(int i = 0;i<arr.length;i++){
            res[i] = map.get(arr1[i]);
        }
        return res;
    }
}