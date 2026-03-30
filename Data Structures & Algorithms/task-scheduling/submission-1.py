class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        q = deque()
        c = Counter(tasks)

        h = [-cnt for cnt in c.values()]

        heapq.heapify(h)
        time = 0
        while h or q:
            time = time+1

            if h:
                v = heapq.heappop(h)
                v = v+1
                
                if v<0:
                    q.append([v,time+n])
            
            if q and q[0][1]<=time:
                heapq.heappush(h,q.popleft()[0])
            
        return time

