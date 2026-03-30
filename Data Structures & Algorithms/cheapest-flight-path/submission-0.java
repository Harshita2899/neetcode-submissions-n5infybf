class Solution {
    class Node
    {
        int pos;
        int cost;
        int stop;
        Node(int c, int d, int s)
        {
            pos = c;
            cost = d;
            stop = s;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer,ArrayList<int[]>> hm = new HashMap();
        int [] dist = new int[n];
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++)
        {
            hm.put(i,new ArrayList<>());
            dist[i] = Integer.MAX_VALUE;
        }
        for(int i=0;i<flights.length;i++)
        {
            hm.get(flights[i][0]).add(new int[]{flights[i][1], flights[i][2]});
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->(a.cost-b.cost));
        pq.offer(new Node(src,0,0));
        dist[src] = 0;
        while((!pq.isEmpty()))
        {
            Node p = pq.poll();
            
            if(p.stop >k)
            {
                continue;
            }
            for(int k1[]: hm.get(p.pos))
            {
                if(dist[k1[0]]>dist[p.pos]+k1[1])
                {
                    dist[k1[0]] = dist[p.pos]+k1[1];
                }
                pq.offer(new Node(k1[0],dist[k1[0]],p.stop+1));
            }           
        }
        if(dist[dst]==Integer.MAX_VALUE)
        {
            return -1;
        }
        return dist[dst];
    }
}
