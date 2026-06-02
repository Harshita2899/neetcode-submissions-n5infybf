class Solution:
    def minimumEffortPath(self, heights: List[List[int]]) -> int:
        dest_i = len(heights)-1
        dest_j = len(heights[0])-1

        directions =[[0,1],[1,0],[-1,0],[0,-1]]

        start_i = 0
        start_j = 0

        minheap_arr = [[0,0,0]] #[dist,r,c]--initially distance=0 and r=0,c=0
        visited=set() #to maintain that we will isit single point only once

        absdiffer=0 #initially 0

        while len(minheap_arr)>0:
            dist,x,y=heapq.heappop(minheap_arr)
            if (x,y) in visited:
                continue
            if x==dest_i and y==dest_j:
                return dist
            visited.add((x,y))
            
            for dir_x,dir_y in directions: 
                new_x = x+dir_x
                new_y = y+dir_y

                if new_x<0 or new_y<0 or new_x>dest_i or new_y>dest_j or (new_x,new_y) in visited:
                    continue
                
                max_dist = max(dist,abs(heights[x][y]-heights[new_x][new_y]))
                heapq.heappush(minheap_arr,(max_dist,new_x,new_y))