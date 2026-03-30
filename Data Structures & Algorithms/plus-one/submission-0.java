class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int c=0;
        for(int i=digits.length-1;i>=0;i--)
        {

            
            
            if(digits[i]+carry>=10)
            {
                c =1;
            }
            else
            {
                c =0;
            }
            digits[i]= (digits[i]+carry)%10;
            carry = c;
        }
        if(carry==1)
        {
            int ans[] =new int[digits.length+1];
            ans[0]= 1;
            for(int i=1;i<ans.length;i++)
            {
                ans[i]=digits[i-1];
                System.out.print(ans[i]);
            }

            return ans;
        }
        return digits;
    }
}
