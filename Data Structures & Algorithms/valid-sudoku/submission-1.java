class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap <Integer, List<Character>> row = new HashMap();
        HashMap<Integer,List<Character>> col = new HashMap();
        HashMap<String,List<Character>> block = new HashMap();
        for(int i=0;i<board.length;i++)
        {
            for(int j =0;j<board[i].length;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                else
                {
                    int blk_i =i/3;
                    int blk_j = j/3;
                    String blk = blk_i+" "+blk_j;
                    row.putIfAbsent(i, new ArrayList());
                    col.putIfAbsent(j, new ArrayList());
                    block.putIfAbsent(blk, new ArrayList());
                    if((row.get(i).contains(board[i][j])) || (col.get(j).contains(board[i][j])) || (block.get(blk).contains(board[i][j])))
                    {
                        return false;
                    }
                    else
                    {
                        row.get(i).add(board[i][j]);
                        col.get(j).add(board[i][j]);
                        block.get(blk).add(board[i][j]);
                    }   
                }
            }
           
        }
         return true;
    }
    
}
