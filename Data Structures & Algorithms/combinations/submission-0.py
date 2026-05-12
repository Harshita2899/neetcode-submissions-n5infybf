class Solution:
    def getCombine(self,n,temp,k):
        if len(temp)==k:
            self.ans.append(temp[:])
            return
        if n<=0:
            return
        
        temp.append(n)
        self.getCombine(n-1,temp,k)
        temp.pop()
        self.getCombine(n-1,temp,k)

    def combine(self, n: int, k: int) -> List[List[int]]:
        self.ans=[]
        self.getCombine(n,[],k)
        return self.ans