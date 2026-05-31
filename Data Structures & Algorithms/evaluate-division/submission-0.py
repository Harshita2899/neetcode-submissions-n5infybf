class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        #in dictionary store a->b such the key:a value:[b,a/b]
        #similarly for reverse b->a such that key:b and value:[a,b/a]
        edge_map=defaultdict(list)
        for i,e in enumerate(equations):
            edge_map[e[0]].append([e[1],values[i]])
            edge_map[e[1]].append([e[0],1/values[i]])
        result=[]

        def bfs(src,target):
            visited=[src]
            q=deque()
            q.append([src,1])
            while q:
                p= q.popleft()
                v = p[0]
                wt = p[1]
                for e in edge_map[v]:
                    if e[0] in visited:
                        continue 
                    if e[0]==target:
                        wt = wt*e[1]
                        return wt
                    visited.append(e[0])
                    q.append([e[0],wt*e[1]])
            return -1

        for q in queries:
            src=q[0]
            target=q[1]

            if src not in edge_map or target not in edge_map:
                result.append(-1.00)
                continue
            
            if src==target:
                result.append(1.00)
                continue
            
            result.append(bfs(src,target))

        return result                

