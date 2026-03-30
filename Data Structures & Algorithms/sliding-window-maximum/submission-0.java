class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        int[] ans = new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<k;i++)
        {
            pq.offer(new int[]{i,nums[i]});
        }
        ans[j++]=pq.peek()[1];
        for(int i=k;i<nums.length;i++)
        {
            while(pq.peek()[0]<=i-k)
            {
                pq.poll();
            }
            pq.add(new int[]{i,nums[i]});
            ans[j++]=pq.peek()[1];
        }
        return ans;
    }
}
