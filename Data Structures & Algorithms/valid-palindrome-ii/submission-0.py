class Solution:
    def validPalindrome(self, s: str) -> bool:
        for i in range(len(s)):
            temp = s[0:i] + s[i+1:]
            if temp[::-1]==temp:
                return True
        return False