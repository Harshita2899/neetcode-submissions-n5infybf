class Solution {
    public String minWindow(String s, String t) {
       Set<Character> hs = new HashSet();
       String ans="";
       String temp="";
       Set<Character> n = new HashSet();
       int previn=0;
       int count=0;
       for(int i=0;i<t.length();i++)
       {
            hs.add(t.charAt(i));
       }
       for(int i=0;i<=s.length()-t.length();i++)
       {
            if(hs.contains(s.charAt(i)))
            {   //System.out.println();
                //System.out.print(s.charAt(i)+" ");
                previn=i;
                count=0;
                temp="";
                n = new HashSet();
                while(previn<s.length())
                {
                    
                    if(hs.contains(s.charAt(previn)) && !n.contains(s.charAt(previn)))
                    {
                        count++;
                        n.add(s.charAt(previn));
                    }
                    temp = temp+s.charAt(previn);
                    //System.out.print(s.charAt(previn));
                    previn++;
                    if(count==t.length())
                    {
                        //System.out.print(" "+temp);
                        if(ans.length()>temp.length() || ans.length()==0)
                        {
                            ans = temp;
                        }
                        break;
                    }                    
                }
                
            }
       } 
       return ans;
    }
}
