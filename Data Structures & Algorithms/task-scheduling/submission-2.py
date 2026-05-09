class Solution:
    def findcount(self,task):
        for i in task:
            self.count[ord(i)-ord('A')]+=1
            
    def heapinsert(self):
        for i in range(len(self.count)):
            if self.count[i]!=0:
                heapq.heappush(self.heap,[-self.count[i],i])

    def countcheck(self):
        for i in list(self.diction.keys()):
            self.diction[i]= self.diction[i]-1
            if self.diction[i]==0:
                del self.diction[i]
                self.setcount.discard(i)
          

    def findleasttime(self,n):
        self.setcount=set()
        self.diction ={}
        count=0
        while len(self.heap)>0:
            count+=1
            self.countcheck()
            temp = []
            while len(self.heap)>0:
                task=chr(self.heap[0][1]+ord('A'))
                if task not in self.setcount:
                    break
                temp.append(heapq.heappop(self.heap))
            if len(self.heap) == 0:
                for i in temp:
                    heapq.heappush(self.heap, i)
                continue
            task=chr(self.heap[0][1]+ord('A'))
            if n>0:
                self.diction[task]=n+1
                self.setcount.add(task)
            c,val=heapq.heappop(self.heap)
            if c+1!=0:
                heapq.heappush(self.heap,[c+1,val])
            for i in temp:
                heapq.heappush(self.heap, i)
        return count

    def leastInterval(self, tasks: List[str], n: int) -> int:
        self.heap=[]
        self.count = [0]*26
        self.findcount(tasks)
        self.heapinsert()
        return self.findleasttime(n)