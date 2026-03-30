class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        indx_dict = {}
        for i in range(len(nums)):
            if nums[i] in indx_dict and i-indx_dict[nums[i]]<=k:
                return True
            indx_dict[nums[i]] = i
        return False
