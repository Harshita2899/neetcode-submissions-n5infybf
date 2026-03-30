class Solution:
    def mySqrt(self, x: int) -> int:
        high = x
        low = 0
        assumed = 0
        while low<= high:
            mid = (low+high)//2
            if mid*mid == x:
                return mid
            elif mid*mid<x:
                assumed = mid
                low = mid+1
            else:
                high = mid-1
        return assumed