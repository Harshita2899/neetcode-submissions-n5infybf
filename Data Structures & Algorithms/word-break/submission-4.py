class Solution:
    class Word:
        def __init__(self):
            self.wordPointer=[None]*26
            self.eow=False
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        root =self.Word()
        for word in wordDict:
            strt = root
            for c in range(len(word)):
                indx = ord(word[c]) - ord('a')
                if strt.wordPointer[indx] is None:
                    strt.wordPointer[indx]=self.Word()
                    
                strt = strt.wordPointer[indx]
            strt.eow = True
        
        memo={}
        def dfs(indx):
            if indx==len(s):
                return True
            if indx in memo:
                return memo[indx]
            cur = root
            for ind in range(indx,len(s)):
                i = ord(s[ind])-ord('a')
                if cur.wordPointer[i] is None:
                    break
                cur = cur.wordPointer[i]
                if cur.eow:
                    if dfs(ind+1):
                        memo[indx]=True
                        return True
            memo[indx]=False
            return False

        return dfs(0)