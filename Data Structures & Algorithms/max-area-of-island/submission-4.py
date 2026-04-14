class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        visited = [[False]*len(grid[0]) for _ in range(len(grid))]
        dir1 =[[0,1],[0,-1],[1,0],[-1,0]]
        def chkisland():
            for i in range(len(grid)):
                for j in range(len(grid[0])):
                    if not visited[i][j] and grid[i][j]==1:
                        return i,j
            return -1,-1

        resmax = 0
        curr = 0
        
        def findArea(i,j):
            q = deque()
            visited[i][j] =True
            q.append([i,j])
            count = 0
            while q:
                indx,indy = q.popleft()
                count+=1
                
                for ind in range(len(dir1)):
                    new_indx = indx+dir1[ind][0]
                    new_indy = indy+dir1[ind][1]

                    if new_indx>=0 and new_indx<len(grid) and new_indy>=0 and new_indy<len(grid[0]) and grid[new_indx][new_indy]==1 and not visited[new_indx][new_indy]:
                        q.append([new_indx,new_indy])
                        visited[new_indx][new_indy] = True
            
            return count

        while True:
            i,j = chkisland()
            if i==-1 and j ==-1:
                break

            curr = findArea(i,j)
            resmax = max(curr,resmax)

        return resmax
