class Solution:
    def solve(self, board: List[List[str]]) -> None:
        q= deque()
        visited = [[False]*len(board[0]) for _ in range(len(board))]
        for i in range(len(board)):
            for j in range(len(board[0])):
                if i==0 or i==len(board)-1 or j==0 or j==len(board[0])-1:
                    if board[i][j]=='O':
                        q.append([i,j])

        direc =[[0,1],[0,-1],[1,0],[-1,0]]

        while q:
            p = q.popleft()
            i = p[0]
            j = p[1]
            board[i][j]='T'
            for k in direc:
                newi=i+k[0]
                newj=j+k[1]
                if 0<=newi<len(board) and 0<=newj<len(board[0]) and not visited[newi][newj] and board[newi][newj]=='O':
                    q.append([newi,newj])
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j]=='O':
                    board[i][j]='X'
                elif board[i][j]=='T':
                    board[i][j]='O'