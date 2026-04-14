class Solution:
    def openLock(self, deadends: List[str], target: str) -> int:
        if '0000' in deadends:
            return -1

        visited = set(deadends)
        
        def findOption(lock):
            res = []
            for i in range(4):
                el = int(lock[i])
                addloc = (el+1)%10
                st = lock[:i]+str(addloc)+lock[i+1:]
                res.append(st)
                subloc = (el -1+10)%10
                st = lock[:i]+str(subloc)+lock[i+1:]
                res.append(st)
            return res


        q = deque()

        q.append([0,'0000'])

        while q:
            el = q.popleft()
            for i in findOption(el[1]):
                if i in visited:
                    continue
                if i ==target:
                    return 1+el[0]
                else:
                    visited.add(i)
                    q.append([el[0]+1,i])
        return -1 