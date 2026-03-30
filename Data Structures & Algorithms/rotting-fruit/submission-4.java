class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer,Integer>> q = new LinkedList();
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new Pair(i,j));
                }
            }
        }
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        int t=0;
        while(!q.isEmpty())
        {
            boolean rot=false;
            int s= q.size();
            for(int i =0;i<s;i++)
            {
                Pair<Integer,Integer> p = q.poll();
                int a = p.getKey();
                int b = p.getValue();
                for(int j =0;j<dir.length;j++)
                {
                    int x = a+dir[j][0];
                    int y = b+dir[j][1];
                    if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y] ==1 )
                    {
                        grid[x][y]= 2;
                        rot=true;
                        q.offer(new Pair(x,y));
                    }
                }

            }
            if(rot)
            {
                t++;
            }
        }
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    return -1;
                }
            }
        }
        return t;
    }
}
