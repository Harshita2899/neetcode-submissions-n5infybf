import heapq
class KthLargest:

    
    def __init__(self, k: int, nums: List[int]):
        self.kl = k
        self.h = []
        for i in nums:
            
            heapq.heappush(self.h,i)
            if(len(self.h)>k):
                heapq.heappop(self.h)

    def add(self, val: int) -> int:
        
        heapq.heappush(self.h, val)   
        if(len(self.h)>self.kl):
            heapq.heappop(self.h)     
        return self.h[0]