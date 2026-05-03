class Solution:
    def reverseBits(self, n: int) -> int:
        res = 0
        for i in range(32):#number of bits =32
            num = (n>>i) & 1
            res = res | (num<<31-i)

        return res