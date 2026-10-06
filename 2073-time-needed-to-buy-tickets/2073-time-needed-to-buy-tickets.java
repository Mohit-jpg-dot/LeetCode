class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i < tickets.length;i++){
            q.offer(i);
        }
        int cnt = 0;
        while(tickets[k]!=0){
            int person = q.poll();
            if(tickets[person] != 0){
                tickets[person]--;
                q.offer(person);
                cnt++;
            }
        }
        return cnt;
    }
}