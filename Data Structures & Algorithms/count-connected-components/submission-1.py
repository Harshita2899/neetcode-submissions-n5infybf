class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        ed ={i:[] for i in range(n)}
        for e in edges:
            ed[e[0]].append(e[1])
            ed[e[1]].append(e[0])

        visited=set()
        connect=0

        def dfs(nds):
            if nds in visited:
                return
            
            visited.add(nds)

            for neighbor in ed[nds]:
                dfs(neighbor)

            return

            
        for i in range(n):
            if i not in visited:
                connect+=1
                dfs(i)

        return connect