class Solution:
    def isValid(self, s: str) -> bool:
        l = []
        for i in s:
            if i in ('[','(','{'):
                l.append(i)
            elif len(l)!=0:
                if i ==']' and l[-1]=='[':
                    l.pop()
                elif i =='}' and l[-1]=='{':
                    l.pop()
                elif i ==')' and l[-1]=='(':
                    l.pop()
                else:
                    return False
            else:
                return False
        return len(l)==0