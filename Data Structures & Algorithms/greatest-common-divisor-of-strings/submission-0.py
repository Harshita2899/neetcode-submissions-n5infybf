class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        
        def checkPossible(s,r):
            if len(r)%len(s)!=0:
                return False
            mul = len(r)//len(s)
            #print(s+" "+r+" "+str(mul))
            if s*mul != r:
                return False
            return True

        if len(str1)>len(str2):
            str1,str2 = str2,str1
        ans =""
        
        for i in range(1,len(str1)+1):
            if checkPossible(str1[:i],str1) and checkPossible(str1[:i],str2):
                ans = str1[:i]

        return ans