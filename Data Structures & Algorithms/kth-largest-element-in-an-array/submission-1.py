class Solution:
    import heapq 
    def findKthLargest(self, nums: List[int], k: int) -> int:
        ans =[]
        for i in nums:
            if len(ans)<k:
                heapq.heappush(ans,i)
            elif ans[0]<i:
                heapq.heappop(ans)
                heapq.heappush(ans,i)

        return ans[0]