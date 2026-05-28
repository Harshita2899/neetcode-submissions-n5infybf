class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        prep={i:[] for i in range(n)}
        for e in edges:
            prep[e[1]].append(e[0])
            prep[e[0]].append(e[1])
            
        visited=set()

        def dfs(crs,par):
            if crs in visited:
                return False
            visited.add(crs)
            for cr in prep[crs]:
                if cr==par:
                    continue
                if not dfs(cr,crs):
                    return False
            return True

        if not dfs(0,-1):
            return False

        return len(visited)==n
            