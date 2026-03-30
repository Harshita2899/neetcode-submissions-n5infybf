class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int max_length=0;
        for(int i =0 ;i<wordDict.size();i++)
        {
            max_length = Math.max(max_length,wordDict.get(i).length());
        }
        boolean[] dp =new boolean [s.length()+1];
        dp[0] = true;
        for(int i=1;i<=s.length();i++)
        {
            for(int j = i-1;j>=0;j--)
            {
                if(j>=0)
                {
                    if(wordDict.contains(s.substring(j,i)))
                    {
                        if(dp[j])
                        {
                            dp[i]=true;
                            break;
                        }
                    }

                }

            }
        }
        return dp[s.length()];
    }
}
