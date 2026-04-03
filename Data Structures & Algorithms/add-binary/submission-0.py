class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i = len(a)-1
        j = len(b)-1

        carry =0;
        res= ''

        while i>=0 or j>=0 or carry>0:

            s = int(a[i]) if i>=0 else 0
            r = int(b[j]) if j>=0 else 0
            tmp = s+r+carry
            carry = tmp//2
            res = chr(ord('0')+tmp%2)+res
            i-=1
            j-=1
        return res