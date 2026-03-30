class Solution {
    public int characterReplacement(String s, int k) {
        Set <Integer> hs =new HashSet();
        int ans =0;
        int i,j,temp,k1;
        char ch;
        for(i=0;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                continue;
            }
            else
            {
                k1= k;
                temp =0;
                ch=s.charAt(i);
                while(i< s.length())
                {
                    if(ch!=s.charAt(i))
                    {
                        if(k1==0)
                        {
                            break;
                        }
                        k1--;
                        
                    }
                    i++;
                    temp++;
                }
                ans=Math.max(ans,temp);
            }
        }
        return ans;

    }
}
