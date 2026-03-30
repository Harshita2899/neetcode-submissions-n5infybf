class Solution:
    def isPalindrome(self, s: str) -> bool:
        str1 =''
        for i in s:
            if i.isalnum():
                str1= str1+i
        
        str1 = str1.lower()
        return str1[::-1]==str1
        