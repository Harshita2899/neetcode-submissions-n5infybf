class Solution {
    public int numDecodings(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int[] dp = new int[s.length()+1];
        dp[s.length()] = 1;
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='0')
            {
                continue;
            }
            else
            {
                dp[i]=dp[i+1];
                if(i+1<s.length())
                {
                    String a = s.substring(i,i+2);
                    int c = Integer.parseInt(a);
                    if((c>=10)&&(c<27))
                    {
                        dp[i]=dp[i]+dp[i+2];
                    }    
                }
            }
        }
        return dp[0];
    }
}
