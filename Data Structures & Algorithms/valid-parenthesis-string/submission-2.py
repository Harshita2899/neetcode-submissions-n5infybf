class Solution:
    def checkValidString(self, s: str) -> bool:
        bracket_stack = []
        star_stack =[]

        for i in range(len(s)):
            if s[i]=='(':
                bracket_stack.append(i)
            elif s[i]=='*':
                star_stack.append(i)
            else:
                if bracket_stack:
                    bracket_stack.pop()
                elif star_stack:
                    star_stack.pop()
                else:
                    return False
        
        while star_stack and bracket_stack:
            if bracket_stack[-1]>star_stack[-1]:
                return False
            bracket_stack.pop()
            star_stack.pop()
        return len(bracket_stack)==0