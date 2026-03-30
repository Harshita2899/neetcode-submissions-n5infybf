class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<strs.size();i++)
        {
            sb.append(strs.get(i)+'#'+'9');
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> st = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)=='#') && (Character.isDigit(str.charAt(i+1))))
            {
                st.add(sb.toString());
                sb = new StringBuilder();
                i++;
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return st;
    }
}
