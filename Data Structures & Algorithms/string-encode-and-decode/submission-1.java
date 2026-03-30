class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<strs.size();i++)
        {
            sb.append(strs.get(i));
            sb.append("#9");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList <String> al=new ArrayList();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)=='#' && Character.isDigit(str.charAt(i+1)))
            {
                al.add(sb.toString());
                sb = new StringBuilder();
                i++;   
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return al;
    }
}
