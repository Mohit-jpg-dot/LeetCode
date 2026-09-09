class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            pq.offer(x);
        }
        while(pq.size() != 1){
            pq.offer(Math.abs(pq.poll() - pq.poll()));
        }
        return pq.poll();
    }
}