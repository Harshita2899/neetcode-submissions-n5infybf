class KthLargest {
    int k;
    PriorityQueue <Integer> p;
    public KthLargest(int k, int[] nums) {
        this.k =k;
        p = new PriorityQueue();

        for(int i =0;i<nums.length;i++)
        {
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        p.offer(val);
        if(p.size()>k)
        {
            p.poll();
        }
        return p.peek();
        
    }
}
