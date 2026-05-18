class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        q = deque()
        direc = [[1,0],[-1,0],[0,1],[0,-1]]
        def findRotten():
            for i in range(len(grid)):
                for j in range(len(grid[0])):
                    if grid[i][j]==2:
                        q.append([i,j])

        def findTime():
            count =-1
            while q:
                l = len(q)
                for k in range(l):
                    i,j = q.popleft()
                    for d in direc:
                        newi = i+d[0]
                        newj = j+d[1]
                        if newi>=0 and newi<len(grid) and newj>=0 and newj<len(grid[0]) and grid[newi][newj]==1:
                            grid[newi][newj]=2
                            q.append([newi,newj])
                
                count+=1
            
            for row in grid:
                if 1 in row:
                    return -1
                
            return 0 if count==-1 else count

            

        findRotten()
        return findTime()