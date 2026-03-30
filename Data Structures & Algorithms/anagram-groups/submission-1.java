class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap();
        List<List<String>>ans = new ArrayList();
        String temp;

        for(int i=0;i<strs.length;i++)
        {
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            temp= new String(arr);
            hm.putIfAbsent(temp, new ArrayList());
            hm.get(temp).add(strs[i]);
        }
        for (Map.Entry<String,List<String>> s: hm.entrySet())
        {
            ans.add(s.getValue());
        }
        return ans;
    }
}
