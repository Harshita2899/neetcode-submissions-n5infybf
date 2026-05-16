class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        directions = [[-1,0],[1,0],[0,-1],[0,1]]
        visited =[[False]*len(grid[i]) for i in range(len(grid))]
        count =0
        def completeIsland(i,j):
            q=deque()
            q.append([i,j])
            while q:
                p = q.popleft()
                iindx=p[0]
                jindx=p[1]
                visited[iindx][jindx]=True
                for k in range(4):
                    newi=iindx+directions[k][0]
                    newj=jindx+directions[k][1]
                    if newi>=0 and newi<len(grid) and newj>=0 and newj<len(grid[i]):
                        if not visited[newi][newj] and grid[newi][newj]=='1':
                            
                            q.append([newi,newj])
                            
                
        
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if not visited[i][j] and grid[i][j]=='1':
                    count +=1
                    completeIsland(i,j)
        return count

        