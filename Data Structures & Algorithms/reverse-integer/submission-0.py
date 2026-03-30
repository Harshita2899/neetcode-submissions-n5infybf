class Solution:
    def reverse(self, x: int) -> int:
        LOW_LIMIT = -2**31
        HIGH_LIMIT = 2**31 - 1
        res = 0
        num = x
        if num<0:
            fl = 1
            num = num* -1
        else:
            fl =0
        while num>0:
            rem = num%10
            num = num//10
            res = res * 10 + rem
            if res>HIGH_LIMIT and res<LOW_LIMIT:
                return 0
        if fl==1:
            res = res*-1
        if res>HIGH_LIMIT or res<LOW_LIMIT:
                return 0
        return res
        