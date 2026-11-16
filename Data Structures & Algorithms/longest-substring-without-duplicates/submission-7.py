class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        exist = {}
        longest =0
        for i in range(0,len(s)):
            if s[i] in exist and l<=exist[s[i]] :
                l = exist[s[i]]+1
            longest = max(longest , i-l+1)
            exist[s[i]] = i

        return longest