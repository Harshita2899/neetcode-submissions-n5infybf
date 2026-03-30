class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] count = new int[numCourses];
        HashMap<Integer,Set<Integer>>  hm= new HashMap();
        for(int i =0;i<prerequisites.length;i++)
        {
            
            hm.putIfAbsent(prerequisites[i][0],new HashSet<>());
            hm.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> q= new LinkedList();
        ArrayList<Integer> a =new ArrayList();
        int key_count=0;
        for(int i=0;i<numCourses;i++)
        {
            if(!hm.containsKey(i))
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            a= new ArrayList();
            int p = q.poll();
            key_count++;
            for(Map.Entry<Integer,Set<Integer>> h: hm.entrySet())
            {
                if(h.getValue().contains(p))
                {
                    h.getValue().remove(p);
                }
                if(h.getValue().size()==0)
                {
                    q.offer(h.getKey());
                    a.add(h.getKey());
                }
            }
            for(int i=0;i<a.size();i++)
            {
                hm.remove(a.get(i));
            }
        }
        return key_count==numCourses;
    }   
}
