class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        ans =[]
        for i in arr:
            heapq.heappush(ans,(-abs(x-i),-i))
            if len(ans)>k:
                heapq.heappop(ans)
        sol=[]
        while len(ans)>0:
            sol.append(-heapq.heappop(ans)[1])

        return sorted(sol)

