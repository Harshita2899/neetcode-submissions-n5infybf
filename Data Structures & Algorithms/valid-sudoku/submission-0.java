class Solution {
    public boolean isValidSudoku(char[][] board) {
     // use of hashmap---one for row  one for column and one for 3 x 3 block 
    HashMap<Integer,Set<Character>> row = new HashMap();
    HashMap<Integer,Set<Character>> col = new HashMap();
    HashMap<String,Set<Character>> block = new HashMap();
    String key;
    for( int i=0;i<board.length;i++)
    {
        for(int j=0;j<board[0].length;j++)
        {
            if(board[i][j]=='.')
            {
                continue;
            }
            else
            {
                key = (i/3)+""+(j/3);
                row.putIfAbsent(i, new HashSet<Character>());
                col.putIfAbsent(j, new HashSet<Character>());
                block.putIfAbsent(key, new HashSet<Character>());
                if(row.get(i).contains(board[i][j]) || col.get(j).contains(board[i][j]) || block.get(key).contains(board[i][j]))
                {
                    return false;
                }
                row.putIfAbsent(i, new HashSet<Character>());
                col.putIfAbsent(j, new HashSet<Character>());
                block.putIfAbsent(key, new HashSet<Character>());
                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                block.get(key).add(board[i][j]);
            }   
        }
    }
    return true;
    }
}
