class Solution {
    boolean chkpossible(int[][]grid , int x, int y)
    {
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]==0|| grid[x][y]==2)
        {
            return false;
        }
        return true;
    }
    public int orangesRotting(int[][] grid) {
        int count=0;
        Queue <int[]> q = new LinkedList();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        int [][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        int s;
        int x,y,newx,newy;
        while(!q.isEmpty())
        {
            s = q.size();
            
            for(int i=0;i<s;i++)
            {

                int[] temp = q.poll();
                x = temp[0];
                y = temp[1];
                for(int j=0;j<dir.length;j++)
                {
                    newx = x+dir[j][0];
                    newy = y+dir[j][1];
                    if(chkpossible(grid,newx,newy))
                    {
                        grid[newx][newy]=2;
                        q.offer(new int[]{newx,newy});
                    }
                }
            }
            count++;

            
        }
        for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
            return -1;
        }
    }
}
        return count-1;
    }
}
