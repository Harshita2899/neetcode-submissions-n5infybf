class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i =0 ;i<position.length;i++)
        {
            pq.add(new int[]{speed[i],position[i]});
        }

        Stack<Integer> st = new Stack();
        while(!pq.isEmpty())
        {
            int [] chk =pq.poll();
            int t = (target -chk[1])/chk[0];
            if(st.isEmpty())
            {
                st.push(t);
            }
            else
            {
                if(st.peek()<t)
                {
                    st.push(t);
                }
            }
        }
        return st.size();
        
    }
}
