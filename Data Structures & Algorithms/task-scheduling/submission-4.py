class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        c = Counter(tasks)
        q =deque()
        h =[-cnt for cnt in c.values()]

        heapq.heapify(h)
        time =0
        while q or h:
            while q and q[0][1]==time:
                el,t=q.popleft()
                heapq.heappush(h,el)
            if h:
                el = heapq.heappop(h)
                if el+1!=0:
                    q.append([el+1,time+n+1])
            time =time+1
            
        return time
