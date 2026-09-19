class Solution:
    def rangeBitwiseAnd(self, left: int, right: int) -> int:
        c =0
        while left!=right:
            left =left>>1
            right =right>>1
            c =c+1
        return left<<c
##basically finding the least signifigant bit till which the bit is not toggled thats why shifting brightto remove the least significant bit and checking whether the values are same is same then return the ans bu left shifting till the count maintained ie number of bit might have toggled 