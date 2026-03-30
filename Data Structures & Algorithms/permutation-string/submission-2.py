class Solution:

    def checkmatch(self,s1,s2):
        count = [0]*26
        for i in range(len(s1)):
            count[ord(s1[i])-ord('a')] +=1
            count[ord(s2[i])-ord('a')] -=1
        for i in range(26):
            if count[i]!=0:
                return False
        return True

    def checkInclusion(self, s1: str, s2: str) -> bool:

        d = 7
        h = 1
        pat =0
        seq = 0

        if len(s1)> len(s2):
            return False

        for i in range(len(s1)):
            h = h*d
            pat = pat * d + ord(s1[i])
            seq = seq * d + ord(s2[i])

        h = h/d

        for i in range(len(s1),len(s2)):
            if pat == seq:
                if self.checkmatch(s1, s2[i-len(s1):i]):
                    return True
            
            seq = seq - h*(ord(s2[i-len(s1)]))
            seq = d*(seq)+ord(s2[i])

        return False


        
        
        