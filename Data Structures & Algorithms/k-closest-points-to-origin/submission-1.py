class Solution:
    import heapq
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        l=[]
        for i in range(0, len(points)):
            calc = math.sqrt(points[i][0]**2 + points[i][1]**2)
            if len(l)<k:
                heapq.heappush(l,[-calc,i])
            
            elif -l[0][1]>calc:
                heapq.heappop(l)
                heapq.heappush(l,[-calc,i])
        ans=[]
        for i in l:
            ans.append([points[i[1]][0],points[i[1]][1]])

        return ans