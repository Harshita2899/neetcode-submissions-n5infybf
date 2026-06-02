class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        adj = defaultdict(list)
        for srcs,dest,price in flights:
            adj[srcs].append([dest,price])
        
        min_chk=[[0,src,k+1]]

        visited=set()

        while len(min_chk)>0:
            cost,srcs,kstops = heapq.heappop(min_chk)
            if kstops<0:
                continue
            if srcs==dst:
                return cost
            for neigh,price in adj[srcs]:
                heapq.heappush(min_chk,[cost+price,neigh,kstops-1])
        
        return -1
            