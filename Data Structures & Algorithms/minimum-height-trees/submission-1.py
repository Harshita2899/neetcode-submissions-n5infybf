class Solution:
    def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
        if n==1:
            return [0]
        adj=defaultdict(list)
        for e in edges:
            adj[e[0]].append(e[1])
            adj[e[1]].append(e[0])
        edge_queue=deque()
        for e,es in adj.items():
            if len(es)==1:
                edge_queue.append(e)
        rem = n
        while rem>2:
            
            l = len(edge_queue)
            rem=rem-l
            for i in range(l):
                e = edge_queue.popleft()
                nei = adj[e][0]
                adj[nei].remove(e)
                if len(adj[nei])==1:
                    edge_queue.append(nei)
                
        return list(edge_queue)