class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int first, second;
        for (int i =0;i<stones.length;i++)
        {
            pq.offer(stones[i]);
        }
        while(pq.size()>1)
        {
            first = Integer.valueOf(pq.poll());
            second = Integer.valueOf(pq.poll());
            if(first- second>0)
            {
                pq.offer(first-second);
            }
            
        }    
        if(pq.size()>0)
        {
            return pq.poll();
        }
        return 0;
    }
}
