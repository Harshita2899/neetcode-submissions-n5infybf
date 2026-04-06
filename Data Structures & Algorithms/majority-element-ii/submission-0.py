class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        d = defaultdict(int)
        for i in nums:
            d[i] +=1
        
        ans =[]
        chk = len(nums)//3
        for key,val in d.items():
            if(val>chk):
                ans.append(key)

        return ans