class Solution:
    def climbStairs(self, n: int) -> int:
        a = 0
        b = 1
        ans = 0
        for i in range(1,n+1):
            ans = a+b
            a = b
            b = ans

        return ans