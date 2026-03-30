class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        exist = {}
        longest =0
        for i in range(0,len(s)):
            if s[i] in exist:
                l = max(l, exist[s[i]])
            longest = max(longest , i-l)
            exist[s[i]] = i

        return longest