class Solution {
    public void solve(char[][] board) {
        Queue<Pair<Integer,Integer>> q = new LinkedList();
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(i==0||j==0||i==board.length-1||j==board[i].length-1)
                {
                    if (board[i][j]=='O')
                    {
                        q.offer(new Pair(i,j));
                    }
                }

            }
        }
        while(!q.isEmpty())
        {
            Pair<Integer,Integer> p = q.poll();
            int x = p.getKey();
            int y = p.getValue();
            board[x][y] = 'T';
            for(int k =0;k<dir.length;k++)
            {
                int nx=x+dir[k][0];
                int ny=y+dir[k][1];
            
                if(nx>=0 && ny>=0 && nx<board.length && ny<board[0].length && board[nx][ny]=='O')
                {
                    q.offer(new Pair(nx,ny));
                }
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if (board[i][j]=='O')
                {
                    board[i][j] = 'X';
                }
                if (board[i][j]=='T')
                {
                    board[i][j] = 'O';
                }

            }
        }
    }
}
