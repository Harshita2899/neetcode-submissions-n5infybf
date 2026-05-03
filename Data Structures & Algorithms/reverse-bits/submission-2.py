class Solution:
    def reverseBits(self, n: int) -> int:
        res = 0
        for i in range(32):#number of bits =32
            num = (n>>i) & 1 # checking whether ith bit is 1 or not
            res = res | (num<<31-i) # includin if the bit is to the desired loc if reversed
    

        return res