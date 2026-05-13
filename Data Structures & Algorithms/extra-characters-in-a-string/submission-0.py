class Node:
    def __init__(self):
        self.chArray=[None]*26
        self.wordEnd=False

class Trie:
    def __init__(self,words):
        self.root = Node()
        for word in words:
            cur =self.root
            for w in word:
                if cur.chArray[ord(w)-ord('a')] is None:
                    cur.chArray[ord(w)-ord('a')]= Node()
                cur = cur.chArray[ord(w)-ord('a')]
            cur.wordEnd = True
        

class Solution:
    
    def minExtraChar(self, s: str, dictionary: List[str]) -> int:
        dp ={}
        dp[len(s)]=0
        root = Trie(dictionary).root
        def dfs(i):
            if i in dp:
                return dp[i]

            res = 1+dfs(i+1)
            cur = root
            for j in range(i,len(s)):
                if cur.chArray[ord(s[j])-ord('a')] is None:
                    break
                cur = cur.chArray[ord(s[j])-ord('a')]
                if cur.wordEnd:
                    res=min(res,dfs(j+1))
            dp[i]=res
            return res

        return dfs(0)