class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        s = ""
        l = len(word1) if len(word1)<=len(word2) else len(word2)
        for i in range(l):
            s = s+word1[i]+word2[i]
        if l<len(word1):
            s += word1[l:]
        elif l<len(word2):
            s += word2[l:] 
        return s