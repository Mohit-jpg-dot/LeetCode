class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue().compareTo(b.getValue()));

        for(Map.Entry<Integer,Integer> Entry:map.entrySet()){
            minHeap.offer(Entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        int i = 0;
        while(k-- > 0){
            result[i++] = minHeap.poll().getKey();
        }
        return result;
    }
}