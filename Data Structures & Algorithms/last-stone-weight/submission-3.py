class Solution:
    import heapq
    def lastStoneWeight(self, stones: List[int]) -> int:
        h = []
        for i in stones:
            heapq.heappush(h,-i)
            
        while len(h)>1:
            el1 = -heapq.heappop(h)
            el2 = -heapq.heappop(h)

            if el1>el2:
                heapq.heappush(h,-(el1-el2))

        return -h[0] if len(h)==1 else 0
