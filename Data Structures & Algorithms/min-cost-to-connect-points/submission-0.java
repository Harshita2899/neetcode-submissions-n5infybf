class Solution {
    class Node
    {
        int[] cord;
        int dist;
        public Node(int[] c, int d)
        {
            cord = new int []{c[0],c[1]};
            dist = d;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        pq.add(new Node(new int[] {points[0][0],points[0][1]}, 0));
        Set<String> hs1 = new HashSet<>();
        for(int i=0;i<points.length;i++)
        {
            hs1.add(points[i][0]+","+points[i][1]);
        }
        Set<String> hs = new HashSet<>();
        int ans=0;
        while(!pq.isEmpty())
        {
            Node p = pq.poll();
            String chk = p.cord[0]+","+p.cord[1];
            if(!hs.contains(chk))
            {
                hs.add(chk);
                hs1.remove(chk);
                ans =ans+p.dist;
                for (String temp : hs1)
                {
                    String[] s = temp.split(",");
                    int a = Integer.parseInt(s[0]);
                    int b = Integer.parseInt(s[1]);
                    int temp_dist = Math.abs(a-p.cord[0]) + Math.abs(b-p.cord[1]);
                    pq.add(new Node(new int[]{a,b},temp_dist));
                }
            }

        }
        return ans;
    }
}
