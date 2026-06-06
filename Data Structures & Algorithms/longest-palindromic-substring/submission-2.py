class Solution:
    def longestPalindrome(self, s: str) -> str:
        len_of_longest_string =0
        x=y=len(s)
        rev=s[::-1]
        m = 0
        posi=0
        posj=0
        dp=[[0]*(len(s)+1) for _ in range(len(s)+1)]
        for i in range(1,len(s)+1):
            for j in range(1,len(s)+1):

                if s[i-1]==rev[j-1]:
                    dp[i][j]=dp[i-1][j-1]+1
                    start_in_s = i - dp[i][j]
                    start_in_rev = len(s) - j
                    if start_in_s == start_in_rev:
                        if m<dp[i][j]:
                            m=dp[i][j]
                            posi=i
                            posj=j

        ans = ''

        return s[posi-m:posi]

