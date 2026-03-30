class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap();
        for( int i=0;i< strs.length;i++)
        {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String chk = new String(ch);
            hm.putIfAbsent(chk,new ArrayList<>());
            hm.get(chk).add(strs[i]);
            
        }
        List<List<String>> ans = new ArrayList();
        for (Map.Entry<String,List<String>> h : hm.entrySet())
        {
            ans.add(h.getValue());
        }
        return ans;

    }
}
