class Solution:
    def minEnd(self, n: int, x: int) -> int:

        sol =x
        bit_n=1
        bit_x=1

        while bit_n<=(n-1):
            if bit_x & x ==0:
                if bit_n & (n-1):
                    sol = sol|bit_x
                bit_n = bit_n<<1
            bit_x=bit_x<<1

        return sol
        '''
        intension was to make the the set bit as it is and replace     the  unset bits of x with bits from right to left with the bits of n-1
        https://www.youtube.com/watch?v=4pP-0UpEok4&t=633s
        
        '''