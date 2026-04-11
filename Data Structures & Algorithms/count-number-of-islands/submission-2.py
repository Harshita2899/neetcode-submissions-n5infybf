class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        count  = 0
        directions =[[0,1],[0,-1],[1,0],[-1,0]]

        visited = [[False]* len(grid[0]) for _ in range(len(grid)) ]

        def checkCount(i,j):
            q = deque()
            q.append([i,j])
            while q:
                p = q.popleft()
                x = p[0]
                y = p[1]
                visited[p[0]][p[1]] = True
                for k in directions:
                    new_x = x+k[0] 
                    new_y = y+k[1]
                    if new_x>=0 and new_x<len(grid) and new_y>=0 and new_y<len(grid[0]) and grid[new_x][new_y]=='1' and not visited[new_x][new_y]:
                        q.append([new_x,new_y])
                    

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] =='1' and not visited[i][j]:
                    count+=1
                    checkCount(i,j)
        return count 