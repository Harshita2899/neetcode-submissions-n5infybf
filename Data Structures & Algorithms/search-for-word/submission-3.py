class Solution:
    def wordSearch(self,board,word,indx,binx,biny):
        if indx==len(word):
            return True

        if binx<0 or biny<0 or binx>=len(board) or biny>=len(board[0]) or indx>=len(word):
            return False

        if board[binx][biny] != word[indx] :
            return False

        
        board[binx][biny]='#'

        res = self.wordSearch(board,word,indx+1,binx+1,biny) or self.wordSearch(board,word,indx+1,binx,biny+1) or self.wordSearch(board,word,indx+1,binx-1,biny) or self.wordSearch(board,word,indx+1,binx,biny-1)
        
        board[binx][biny] = word[indx]

        return res


    def exist(self, board: List[List[str]], word: str) -> bool:
        
        for i in range(len(board)):
            for j in range(len(board[0])):
        
                if self.wordSearch(board,word,0,i,j):
                    return True
        return False