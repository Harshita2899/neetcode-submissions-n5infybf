class Solution {
    boolean wordexist(char[][] board, int[][] dir,int x, int y, String s, int temp,boolean[][] visited)
    {
        
        if (temp == s.length())
        {
            return true;
        }
        if(x>=board.length|| x<0|| y>=board[0].length||y<0||visited[x][y]|| s.charAt(temp)!=board[x][y])
        {
            return false;
        }
        visited[x][y]=true;
        for (int i =0;i<dir.length;i++)
        {
            if(wordexist(board,dir,x+dir[i][0],y+dir[i][1],s,temp+1,visited))
            {
                return true;
            }
        }
        visited[x][y]=false;
        return false;
    }
    public List<String> findWords(char[][] board, String[] words) {
        int[][] dir ={{-1,0},{1,0},{0,1},{0,-1}};
        
        List<String> a = new ArrayList();
        for(int i =0;i<words.length;i++)
        {
            for(int r=0;r<board.length;r++)
            {
                for(int c=0;c<board[0].length;c++)
                {
                    if(board[r][c]!=words[i].charAt(0))
                    {
                        continue;
                    }
                    boolean[][] visited = new boolean[board.length][board[0].length];
                    if(wordexist(board,dir,r,c,words[i],0,visited))
                    {
                        a.add(words[i]);
                        break;
                    }
                }
            }
            
        }
        return a;
    }
}
