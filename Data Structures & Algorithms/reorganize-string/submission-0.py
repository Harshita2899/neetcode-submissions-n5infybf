class Solution:
    def countElement(self,s):
        for i in s:
            self.count[ord(i)-ord('a')] += 1

    def reorganizeString(self, s: str) -> str:
        self.count=[0]*26
        self.countElement(s)
        h=[]
        for i in range(26):
            if self.count[i]!=0:
                heapq.heappush(h,[-self.count[i],chr(i+ord('a'))])
        
        q=deque()
        time=0
        ans=""
        while q or h:
            while q and q[0][2]<=time:
                cnt,ch,t=q.popleft()
                heapq.heappush(h,[cnt,ch])
            time=time+1
            if h:
                cnt,ch = heapq.heappop(h)
                ans=ans+ch
                if cnt+1==0:
                    continue
                q.append([cnt+1,ch,time+1])
            else:
                break
        if len(q)>0:
            return ""
        return ans
