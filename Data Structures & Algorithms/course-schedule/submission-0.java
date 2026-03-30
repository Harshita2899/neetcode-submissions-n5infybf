class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<prerequisites.length;i++)
        {
            pq.offer(prerequisites[i]);
        }
        while(!pq.isEmpty())
        {
            int[] a = pq.poll();
            if(a[0]>a[1])
            {
                return false;
            }
        }
        return true;
    }
}
