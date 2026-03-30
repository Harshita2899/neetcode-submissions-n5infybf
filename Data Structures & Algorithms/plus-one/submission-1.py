class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 0
        flag =1
        for i in range(len(digits)-1,-1,-1):
            digits[i] = flag +carry+digits[i]
            flag =0
            if digits[i]>9:
                digits[i] = digits[i] % 10
                carry = 1
            else:
                carry = 0

        if carry == 1:
            digits = [1]+digits

        return  digits