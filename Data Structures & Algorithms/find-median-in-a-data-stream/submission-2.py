class MedianFinder:

    def __init__(self):
        self.maxheap=[]
        self.minheap=[]

    def addNum(self, num: int) -> None:
        if len(self.maxheap)<=len(self.minheap):
            if self.minheap and num>self.minheap[0]:
                heapq.heappush(self.maxheap,-heapq.heappop(self.minheap))
                heapq.heappush(self.minheap,num)
            else:
                heapq.heappush(self.maxheap,-num)
        else:
            if num<-self.maxheap[0]:
                heapq.heappush(self.minheap,-heapq.heappop(self.maxheap))
                heapq.heappush(self.maxheap,-num)
            else:
                heapq.heappush(self.minheap,num)


    def findMedian(self) -> float:
        if len(self.maxheap)>len(self.minheap):
            return -self.maxheap[0]
        else:
            return (-self.maxheap[0]+self.minheap[0])/2
        