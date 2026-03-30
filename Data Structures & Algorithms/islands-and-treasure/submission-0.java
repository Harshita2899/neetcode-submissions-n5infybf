class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        int[][] dir={{1,0},{0,1},{0,-1},{-1,0}};
        Queue <Pair<Integer,Integer>> q = new LinkedList();
        for(int i=0;i<grid.length;i++)
        {
            for (int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    q.offer(new Pair(i,j));
                }
            }
        }
        int val = 0;
        while (!q.isEmpty())
        {
            val++;
            int size = q.size();
            for(int i = 0;i<size;i++)
            {
                Pair<Integer,Integer> p = q.poll();
                int a = p.getKey();
                int b = p.getValue();
                for(int j = 0;j<dir.length;j++)
                {
                    int x= a+dir[j][0];
                    int y = b +dir[j][1];
                    if(x<0 || y<0 || x>=grid.length || y>=grid[0].length||  grid[x][y] != Integer.MAX_VALUE )
                    {
                        continue;
                    }
                    grid[x][y]= val;
                    q.offer(new Pair(x,y));
                }   
                
            }

        }
        
    }
}
