class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(int i =0;i<tasks.length;i++)
        {
            count[tasks[i]-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            {
                pq.add(count[i]);
                
            }
        }
        HashMap<Integer,Integer> hm = new HashMap();
        int t = 0;
        while(pq.size()>0 || hm.size()>0)
        {
            int add_val =-1;
            if(hm.containsKey(t))
            {
                add_val=hm.get(t);
                hm.remove(t);
            }
            if(!pq.isEmpty())
            {
                int p = pq.poll();
                //System.out.println(p+" "+t);
                if(p>1)
                {
                    int key = t+n;
                    int val = p-1;
                    hm.put(key,val);
                }
            }
            if(add_val!=-1)
            {
                pq.offer(add_val);
            }
            t++;
        }
        return t;
    }
}
