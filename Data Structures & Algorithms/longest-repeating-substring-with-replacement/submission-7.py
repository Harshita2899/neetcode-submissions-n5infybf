class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        distinctCharacter = set(s)
        res = 0
        for ch in distinctCharacter:#iterating through each distinct cahr of the string
            l=0#left part of the window
            count =0#counting  ch in that window
            for r in range(len(s)):#inscreasing r and checking 
                if s[r]==ch:
                    #find how many ch in that range
                    count+=1
                window_size = r-l+1
                while window_size-count>k:
                    if s[l] == ch:
                        count-=1
                    l+=1 # reducing window
                    window_size = r-l+1
                res = max(res,window_size)
        return res