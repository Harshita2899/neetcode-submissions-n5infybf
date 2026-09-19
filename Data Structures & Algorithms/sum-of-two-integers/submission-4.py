class Solution:
    def getSum(self, a: int, b: int) -> int:
        mask = 0xffffffff # mask is for 32 bits
        while (mask&b)>0:
            a,b = (a^b), ((a&b)<<1) # a= addition of a n b , b= carry --which will be added later

        return a&mask if b>0 else a


        '''
        a= 2
        b = 3

       10---->carry
        11(3)
        10(2)
       101   ---->5

observation 
0 0 --->0
0 1 --->1
1 0 --->1
1 1 --->0(carry 1)

XOR:(for adding)
0 0 --->0
0 1 --->1
1 0 --->1
1 1 --->0

AND: for carry
0 0 --->0
0 1 --->0
1 0 --->0
1 1 --->1

concept was adding carry later thats why adding till b is greater than 0

        '''