class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i =0;i<nums.length;i++)
        {
            hm.putIfAbsent(nums[i],0);
            int count = hm.get(nums[i]);
            hm.put(nums[i],count+1);
        } 
       
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for( Map.Entry<Integer,Integer> s: hm.entrySet()){
            pq.add(new int[]{s.getKey(), s.getValue()});
        }
        int[] ans= new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]= pq.poll()[0];
        }
        return ans;
    }
}
