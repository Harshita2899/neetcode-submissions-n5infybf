class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] min_time = new int[n+1];
        //int[] distance = new int[n+1];
        boolean[] visited = new boolean[n+1];
        Map<Integer, ArrayList<int[]>> hm = new HashMap();
        for(int i=1;i<=n;i++)
        {
            min_time[i] = Integer.MAX_VALUE;
            hm.put(i, new ArrayList());
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
        pq.add(new int[]{k,0});
        min_time[k] = 0;
        for(int i=0;i<times.length;i++)
        {
            hm.get(times[i][0]).add(new int[]{times[i][1], times[i][2]});
        }
        
        
        while(!pq.isEmpty())
        {
            int[] temp = pq.poll();
            if(!visited[temp[0]])
            {
                visited[temp[0]]= true;
            
                for(int[] n1: hm.get(temp[0]))
                {
                    
                    if( min_time[n1[0]]>min_time[temp[0]]+n1[1])
                    {
                        min_time[n1[0]] = min_time[temp[0]]+n1[1];
                    }
                    pq.offer(new int[]{n1[0],min_time[n1[0]]});
                }
            }
        }
        int time = Integer.MIN_VALUE;
        for(int i =0;i<min_time.length;i++)
        {
            if(min_time[i]==Integer.MAX_VALUE)
            {
                return -1;
            }
            time = Math.max(time, min_time[i]);
        }
        return time;
    }
}
