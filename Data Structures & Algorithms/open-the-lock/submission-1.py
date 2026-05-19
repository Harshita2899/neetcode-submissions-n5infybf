class Solution:
    def openLock(self, deadends: List[str], target: str) -> int:
        if '0000' in deadends:
            return -1
        if target == "0000":
            return 0
        visited = set(deadends)
        def findPatterns(stcode):
            res=[]
            for i in range(4):
                val = int(stcode[i])
                addon = (val+1)%10
                subon = (val-1+10)%10
                temp = stcode[:i]+str(addon)+stcode[i+1:]
                res.append(temp)
                temp = stcode[:i]+str(subon)+stcode[i+1:]
                res.append(temp)
            return res
        
        q= deque()
        q.append([0,'0000'])
        while q:
            p = q.popleft()
            for i in findPatterns(p[1]):
                if i in visited:
                    continue
                if i==target:
                    return p[0]+1
                else:
                    visited.add(i)
                    q.append([p[0]+1,i])
                
        return -1
         

