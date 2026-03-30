class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longes = 0

        for i in nums:
            if i-1 in nums:
                continue
            else:
                c =0
                j =i
                while True:
                    if j in nums:
                        c = c+1
                        j = j+1
                    else:
                        break

                longes = max(c,longes)

        return longes