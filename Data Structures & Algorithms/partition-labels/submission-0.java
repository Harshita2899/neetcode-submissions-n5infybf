class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList();
        int[] lastoccurence = new int[26];
        for(int i=0;i<s.length();i++)
        {
            lastoccurence[s.charAt(i)-'a']=i;
        }
        int end=-1,size=0,cur,f=0;
        for(int i =0;i<s.length();i++)
        {
            
            f=1;
            cur = lastoccurence[s.charAt(i)-'a'];
            end = Math.max(end,cur);
            size++;
            if(end==i)
            {
                ans.add(size);
                size=0;
                f=0;
                continue;
            }
            
            //System.out.println(end+" "+i+" "+s.charAt(i)+" "+ cur+" "+size);
            
        }
        if(f==1)
        {
            ans.add(size);
        }
        return ans;
    }
}
