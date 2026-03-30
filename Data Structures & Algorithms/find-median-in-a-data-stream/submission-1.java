class MedianFinder {

    private PriorityQueue<Integer> left;  // max-heap
    private PriorityQueue<Integer> right; // min-heap
    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder()); 
        right =new PriorityQueue();

    }
    
    public void addNum(int nums) {
        if(left.size()==0)
        {
            left.add(nums);
        }
        else if(left.size()>right.size())
        {
            if(nums<left.peek())
            {
                right.add(left.poll());
                left.add(nums);
            }
            else
            {
                right.add(nums);
            }
        }
        else
        {
            if(nums>right.peek())
            {
                left.add(right.poll());
                right.add(nums);
            }
            else
            {
                left.add(nums);
            }
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size())
        {
            return left.peek();
        }
        else
        {
            return ((left.peek()+right.peek())/2.0);
        }
        
    }
}
