class Solution {
    public boolean isPalindrome(String s) {
        int start=0, end =s.length()-1;
        boolean flag = true;
        while(start<=end)
        {
            
            while (start<=end && !Character.isLetterOrDigit(s.charAt(start)))
            {
                start++;
            }
            while (start<=end && !Character.isLetterOrDigit(s.charAt(end)))
            {
                end--;
            }
            System.out.println(start +" "+ end);
            if (start<=end && Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))
            {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }
}
