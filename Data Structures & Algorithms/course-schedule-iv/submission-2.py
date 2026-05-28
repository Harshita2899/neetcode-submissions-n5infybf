class Solution:
    def checkIfPrerequisite(self, numCourses: int, prerequisites: List[List[int]], queries: List[List[int]]) -> List[bool]:
        prereq= {i:[] for i in range(numCourses)}
        for pre in prerequisites:
            prereq[pre[0]].append(pre[1])
        prep={}
        visit=set()
        def dfs(crs):
            if crs in visit:
                return False
            if crs in prep:
                return True
            visit.add(crs)
            prep[crs]=set()
            prep[crs].add(crs)
            for cr in prereq[crs]:
                if not dfs(cr):
                    return False
                prep[crs].update(set(prereq[crs]))
                prep[crs].update(prep[cr])
            visit.remove(crs)
            return True
        ans =[]  
        for i in range(numCourses):
            if not dfs(i):
                return [False]*len(queries)
        for q in queries:
            ans.append(q[1] in prep[q[0]])
        return ans
