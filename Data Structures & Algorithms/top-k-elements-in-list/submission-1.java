class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap();
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for (int i =0;i<nums.length;i++)
        {
            hm.putIfAbsent(nums[i],0);
            hm.put(nums[i],hm.get(nums[i])+1);
        }

        for(Map.Entry<Integer,Integer> s: hm.entrySet())
        {
           //System.out.println(s.getKey()+" "+s.getValue());
           pq.offer(new int[]{s.getKey(),s.getValue()});
           if (pq.size()>k)
           {
                pq.poll();
            }
        }
        int[ ] ans = new int[k];
        int i =0;
        while(!pq.isEmpty())
        {
            ans[i++] = pq.poll()[0];
        }
        return ans;
    }
}
