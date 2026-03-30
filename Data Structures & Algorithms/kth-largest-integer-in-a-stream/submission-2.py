import heapq
class KthLargest:

    h = []
    kl = 0
    def __init__(self, k: int, nums: List[int]):
        self.kl = k
        for i in nums:
            if(len(self.h)>=k):
                heapq.heappop(self.h)
            heapq.heappush(self.h,i)
        

    def add(self, val: int) -> int:
        if(len(self.h)>=self.kl):
            heapq.heappop(self.h)
        heapq.heappush(self.h, val)        
        return self.h[0]