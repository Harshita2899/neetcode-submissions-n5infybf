class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for (int i =0;i<stones.length;i++)
        {
            pq.offer(stones[i]);
        }
        int a,b;
        while(pq.size()>1)
        {
            a=pq.poll();
            b=pq.poll();
            if(a==b)
            {
                continue;
            }
            pq.offer(a-b);
        }
        if(pq.size()==0)
        {
            return 0;
        }
        return pq.poll();
    }
}
