class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:
        visited =set() #to maintain there is no repeation 
        res = 0
        N = len(points)
        adj = {i:[] for i in range(N)}

        for i in range(N):
            x1,y1=points[i][0],points[i][1]
            for j in range(i+1,N):
                x2,y2=points[j][0],points[j][1]
                dist = abs(x1-x2)+abs(y1-y2)
                adj[i].append([j,dist])
                adj[j].append([i,dist])

        min_chk = [[0,0]] #initiallising with 0th index...[dist,indx]

        while len(visited)<N:
            dist,indx = heapq.heappop(min_chk)
            if indx in visited:
                continue

            visited.add(indx)
            res=res+dist
            for ad in adj[indx]:
                if ad[0] in visited:
                    continue
                heapq.heappush(min_chk,([ad[1],ad[0]]))

        return res
            
