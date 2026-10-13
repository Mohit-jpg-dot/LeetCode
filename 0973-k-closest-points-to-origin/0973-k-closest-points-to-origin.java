class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i = 0;i<points.length;i++){
        //     int cal = (int)(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
        //     pq.offer(cal);
        // }
        // int[][] arr = new int[k][2];
        // for(int i = 0;i<k;i++){
        //     int n = pq.poll();
        //     for(int j = 0;j<points.length;j++){
        //         int cal = (int)(Math.pow(points[j][0],2)+Math.pow(points[j][1],2));
        //         if(n == cal){
        //             arr[i][0] = points[j][0];
        //             arr[i][1] = points[j][1];
        //             points[j][0] = Integer.MAX_VALUE; 
        //             break;
        //         }
        //     }
        // }
        // return arr;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
        Integer d1 = a[0]*a[0]+a[1]*a[1];
        Integer d2 = b[0]*b[0]+b[1]*b[1];
        return Integer.compare(d1,d2);
    });
        for(int i = 0;i<points.length;i++){
            pq.offer(points[i]);
        }
        int[][] ans = new int[k][2];
        for(int i = 0;i<k;i++){
            ans[i] = pq.poll();
        }
        return ans;

    }
}