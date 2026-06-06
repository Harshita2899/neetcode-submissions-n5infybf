class Solution:
    def countSubstrings(self, s: str) -> int:
        count=0
        for i in range(len(s)):
            #for odd string 
            l=i
            m=i
            while l>=0 and m<len(s):
                if s[l]==s[m]:
                    count +=1
                    l -=1
                    m +=1
                else:
                    break

            #for even string 
            l=i
            m=i+1
            while l>=0 and m<len(s):
                if s[l]==s[m]:
                    count +=1
                    l -=1
                    m +=1
                else:
                    break
        return count

        