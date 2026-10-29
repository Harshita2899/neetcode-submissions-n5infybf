class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def bfs(q,d):
            while q:
                indx,jindx=q.popleft()
                
                for i,j in d:
                    new_i=indx+i
                    new_j=jindx+j
                    if new_i>=0 and new_i<len(grid) and new_j>=0 and new_j<len(grid[0]) and grid[new_i][new_j]=='1':
                        q.append((new_i,new_j))
                        grid[new_i][new_j]='0'


        directions =[[1,0],[-1,0],[0,1],[0,-1]]
        q=deque()
        count =0
        for i in range(len(grid)):
            for j  in range(len(grid[0])):
                if grid[i][j]=='1':
                    q.append((i,j))
                    grid[i][j]='0'
                    bfs(q,directions)
                    count+=1
        
        return count

        