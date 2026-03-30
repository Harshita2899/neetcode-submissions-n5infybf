class Solution {
    public String multiply(String num1, String num2) {
        int carry =0;
        int c=0;
        int temp=0;
        int b2=10;
        int ans=0;
        if(num1.length()>num2.length())
        {
            String t= num1;
            num1=num2;
            num2=t;

        }
        StringBuilder sb =new StringBuilder();
        for(int i =num1.length()-1;i>=0;i--)
        {
            int m=0;
            int base=1;
            temp = 0;
            carry =0;
            for(int j =num2.length()-1;j>=0;j--)
            {
                temp = (num2.charAt(j)-'0')*(num1.charAt(i)-'0')+carry;
                carry = temp /10;
                m =m+base*(temp%10);
                base=base*10;
            }
            if(carry>0)
            {
                int p = (""+m).length();
                m = m+(int)Math.pow(10,p)*carry;
            }
            ans = c+ m;
            c= ans/10;
            int t = ans % 10;
            sb.append(""+t);

        }
        
        while (c>0)
        {
            sb.append(""+(c%10));
            c=c/10;
        }
        return sb.reverse().toString();
    }
}
