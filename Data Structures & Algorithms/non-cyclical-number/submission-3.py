class Solution:
    def isHappy(self, n: int) -> bool:
        c = set()
        while True:
            temp = n
            sum1 = 0
            while n>0:
                rem = n % 10
                sum1 = sum1 + rem*rem
                n = n//10

            if sum1 in c:
                return False
            if sum1==1:
                return True
            c.add(sum1)
            n = sum1

        return False 