class Solution:
    def gen(self,ans,temp, openBrac, closeBrac):
        if openBrac==0 and closeBrac==0:
            ans.append(temp)
            return 

        if closeBrac<openBrac:
            return
        
        if closeBrac>0:
            temp = temp+')'
            self.gen(ans,temp, openBrac, closeBrac-1)
            temp = temp[:-1]

        if openBrac>0:
            temp = temp+'('
            self.gen(ans,temp, openBrac-1, closeBrac)
            temp = temp[:-1]

        



    def generateParenthesis(self, n: int) -> List[str]:
        ans =[]
        self.gen(ans,'',n,n)
        return ans 