class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree=new int[numCourses];
        List<List<Integer>> adj = new ArrayList();
        for(int i =0;i<numCourses;i++)
        {
            adj.add(new ArrayList());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];
            adj.get(pre).add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty())
        {
            int p =q.poll();
            c++;
            for(int n : adj.get(p))
            {
                indegree[n]--;
                if(indegree[n]==0)
                {
                    q.offer(n);
                }
            }
        }
        return c==numCourses;
    }
}
