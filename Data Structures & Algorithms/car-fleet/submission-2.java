class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i =0 ;i<position.length;i++)
        {
            pq.add(new int[]{speed[i],position[i]});
        }

        double lastTime =-1;
        int count =0;
        while(!pq.isEmpty())
        {
            int [] chk =pq.poll();
            int dist = target - chk[1];
            System.out.println(dist+" "+chk[0]);
            double t = (double)dist/chk[0];
            System.out.println(t);
            if(lastTime ==-1)
            {
                lastTime = t;
                count++;
            }
            else
            {
                if(t>lastTime)
                {
                   lastTime = t;
                   count++;
                }
            }
        }
        return count;
        
    }
}
