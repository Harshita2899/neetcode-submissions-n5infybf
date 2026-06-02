class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        minheap = [(0,k)]# initially start from k

        adj = defaultdict(list) # initialising dictionary with list 

        for u,v,w in times:
            adj[u].append([v,w]) #append target node and the wt

        visited=set()
        total_wieght=0
        while len(minheap)>0:
            wt1 , src =heapq.heappop(minheap)
            
            if src in visited: # check to avoid cycle condition 
                continue
            total_wieght = wt1
            visited.add(src)
            for neig,wt in adj[src]:
                if neig in visited:
                    continue
                heapq.heappush(minheap,(wt1+wt,neig))
        
        return total_wieght if len(visited)==n else -1