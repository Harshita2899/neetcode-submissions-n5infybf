class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        iindx = -1
        jindx = -1
        q= deque()
        direction=[[-1,0],[1,0],[0,-1],[0,1]]
        visited=[[False]*len(grid[i]) for i in range(len(grid))]
        def findTreasure():
            for i in range(len(grid)):
                for j in  range(len((grid[i]))):
                    if grid[i][j]==0:
                        
                        q.append([i,j])
                        
            return 
        
        def allocateDistance():
            
            while q:
                lenth=len(q)
                for l in range(lenth):
                    p = q.popleft()
                    curi=p[0]
                    curj=p[1]
                    visited[curi][curj]=True
                    for k in range(4):
                        newi=curi+direction[k][0]
                        newj=curj+direction[k][1]
                        
                        if newi>=0 and newi<len(grid) and newj>=0 and newj<len(grid[0]) and not visited[newi][newj] and grid[newi][newj]==2147483647:
                            grid[newi][newj] = grid[curi][curj]+1
                            visited[newi][newj]=True
                            q.append([newi,newj])

        findTreasure()
        allocateDistance()