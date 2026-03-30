class Solution {
    class Node
    {
        int pos;
        int cost;
        int stop;
        Node(int p, int c, int s)
        {
            pos = p;
            cost = c;
            stop = s;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] minStop = new int[n];
        Arrays.fill(minStop, Integer.MAX_VALUE);
        Map<Integer, List<int[]>> hm = new HashMap();
        for(int i =0;i<n;i++)
        {
            hm.put(i,new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++)
        {
            hm.get(flights[i][0]).add(new int[]{flights[i][1],flights[i][2]});
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new Node(src,0,0));
        while(!pq.isEmpty())
        {
            Node p = pq.poll();
            if(p.pos == dst)
            {
                return p.cost;
            }
            if(p.stop>k || p.stop>=minStop[p.pos])
            {
                continue;
            }
            minStop[p.pos] = p.stop;
            for(int[] nbr: hm.get(p.pos))
            {
                pq.offer(new Node(nbr[0],p.cost+nbr[1],p.stop+1));
            }
        }
        return -1;
    }
}
