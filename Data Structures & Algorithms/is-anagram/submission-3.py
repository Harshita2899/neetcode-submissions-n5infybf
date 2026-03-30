class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ls = list(s)
        for i in t:
            if i in ls:
                ls.remove(i)
            else:
                return False
        
        return len(ls)==0