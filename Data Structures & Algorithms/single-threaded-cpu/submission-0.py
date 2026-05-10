class Solution:
    def getOrder(self, tasks: List[List[int]]) -> List[int]:
    
        h =[]
        ans=[]
        i=0
        tasks = sorted([(t[0], t[1], i) for i, t in enumerate(tasks)])
        time =tasks[0][0]
        
        while i<len(tasks) or h:
            while i<len(tasks) and tasks[i][0]<=time:
                heapq.heappush(h,[tasks[i][1],tasks[i][2]])
                i+=1

            if h:
                t,indx=(heapq.heappop(h))
                ans.append(indx)
                time=t+time
            
            else:
                time=tasks[i][0]
        
        return ans
