class Solution {
    public boolean isPalindrome(String s) {
        int first=0;
        int last = s.length()-1;
        while(first<=last)
        {
            if((Character.isDigit(s.charAt(first))|| Character.isLetter(s.charAt(first)) ) && (Character.isDigit(s.charAt(last))|| Character.isLetter(s.charAt(last))))
            {
                if(Character.toLowerCase(s.charAt(first))!=Character.toLowerCase(s.charAt(last)))
                {
                    //System.out.println(s.charAt(first)+" "+s.charAt(last));
                    return false;
                }
                first++;
                last--;
            }
            else if (!Character.isDigit(s.charAt(last))|| !Character.isLetter(s.charAt(last)))
            {
                last--;
            }
            else
            {
                first++;
            }

        }
        return true;
    }
}
