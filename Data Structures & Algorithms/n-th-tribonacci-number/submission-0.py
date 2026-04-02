class Solution:
    def tribonacci(self, n: int) -> int:
        if n==0 or n==1:
            return n
        
        a0 = 0
        a1 = 1
        a2 = 1
        c = 2
        while c<n:
            tmp = a0+a1+a2
            a0=a1
            a1=a2
            a2=tmp
            c+=1
        return a2