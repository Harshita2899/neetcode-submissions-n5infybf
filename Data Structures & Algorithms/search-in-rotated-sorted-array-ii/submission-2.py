class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        low = 0 
        high = len(nums)-1

        while low<=high:
            mid =(low+high)//2
            if nums[mid]==target:
                return True
            elif nums[mid]==nums[high]:
                high = high -1
            elif nums[mid]<nums[high]:
                if nums[mid]<target and nums[high]>=target:
                    low = mid+1
                else:
                    high = mid-1
            else:
                if nums[low]<=target and nums[mid]>target:
                    high = mid-1
                else:
                    low = mid+1
        return False

        