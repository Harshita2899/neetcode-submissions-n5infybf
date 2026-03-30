class Solution {
    public String minWindow(String s, String t) {
       HashMap<Character, Integer> hm = new HashMap();
       String ans="";
       String temp="";
       Map<Character, Integer> n = new HashMap();
       int previn=0;
       int count=0;
       for(int i=0;i<t.length();i++)
       {
            if(!hm.containsKey(t.charAt(i)))
            {
                hm.put(t.charAt(i), 1);
            }
            else
            {
                hm.put(t.charAt(i),hm.get(t.charAt(i))+1);
            }
       }
       for(int i=0;i<=s.length()-t.length();i++)
       {
            if(hm.containsKey(s.charAt(i)))
            {   //System.out.println();
                //System.out.print(s.charAt(i)+" ");
                previn=i;
                count=0;
                temp="";
                n = new HashMap();
                while(previn<s.length())
                {
                    
                    if(hm.containsKey(s.charAt(previn)) && (n.getOrDefault(s.charAt(previn),0)<hm.get(s.charAt(previn))|| !n.containsKey(s.charAt(previn))))
                    {
                        count++;
                        if(!n.containsKey(s.charAt(previn)))
                        {
                            n.put(s.charAt(previn), 1);
                        }
                        else
                        {
                            n.put(s.charAt(previn),n.get(s.charAt(previn))+1);
                        }
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
