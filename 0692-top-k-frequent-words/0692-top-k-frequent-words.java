class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b) -> {
            if(a.getValue().equals(b.getValue())){
                return b.getKey().compareTo(a.getKey());
            }
            return Integer.compare(a.getValue(),b.getValue());
        });
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
}