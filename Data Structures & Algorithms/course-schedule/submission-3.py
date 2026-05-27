class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        prereq ={i:[] for i in range(numCourses)}  
        for pre in prerequisites:
            prereq[pre[1]].append(pre[0])
        visited=set()
        def dfs(crs):
            if crs in visited:
                return False
            visited.add(crs)
            for cr in prereq[crs]:
                if not dfs(cr):return False
            visited.remove(crs)
            return True
        for i in range(numCourses):
            if not dfs(i):
                return False
        return True
