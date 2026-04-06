class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict_chk = defaultdict(int)
        s=0
        ans =0
        dict_chk[0] =1
        for i in nums:
            s = s+i
            tmp = s-k
            ans =ans +dict_chk[tmp]
            dict_chk[s]+=1
        return ans

        
