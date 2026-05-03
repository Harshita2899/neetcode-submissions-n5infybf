class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        charSet = set(s)
        res = 0
        for c in charSet:
            count = 0
            l = 0
            for r in range(len(s)):
                if s[r]==c:
                    count += 1

                while r-l+1 - count >k:
                    if s[l] ==c:
                        count -=1
                    l += 1

                res = max(res, r-l+1)

        return res
'''
Your code is a correct sliding-window solution. It tries every distinct character in s as the character you want the whole window to become.

What count means

For a chosen character c, count = how many times c appears inside the current window [l, r].

Window size is:

r - l + 1

So the number of characters that are not c is:

(r - l + 1) - count

Those are the characters you would need to replace.

If that number becomes more than k, the window is invalid, so move l forward.
'''

        