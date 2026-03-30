class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        int distance;
        for(int i=0;i<points.length;i++)
        {
            distance =  points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.offer(new int[]{distance,i});
            if (pq.size()>k )
            {
                pq.poll();
            }
            
        }
        int[][] ans = new int[k][2];
        int i=0;
        while(!pq.isEmpty())
        {
            int[] temp = pq.poll();
            ans[i++] = points[temp[1]];
            
        }
        return ans;        
    }
}
