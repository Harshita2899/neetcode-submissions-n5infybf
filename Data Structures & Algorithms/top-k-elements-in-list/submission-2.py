class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        ans = []
        for i in nums:
            if i in count:
                count[i] = count[i]+1
            else:
                count[i] = 1
        
        freq  = [[] for i in range(0,len(nums)+1)]
        
        for key,value in count.items():
            freq[value].append(key)

        for i in range(len(nums),0,-1):
            for j in freq[i]:
                ans.append(j)
                if len(ans) == k:
                    return ans

        return ans
