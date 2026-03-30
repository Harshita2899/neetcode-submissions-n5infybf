class Solution {
    public String multiply(String num1, String num2) {
        int temp, carry=0, m=0,base=1;;
        int[] ans = new int[num1.length()+num2.length()+1];
        int k = num1.length()+num2.length();
        int l,c;
        StringBuilder sb =new StringBuilder();
        for(int i =num1.length()-1;i>=0;i--)
        {
            carry=0;
            m=0;
            base=1;            
            k =i+num2.length();
            for(int j =num2.length()-1;j>=0;j--)
            {
                temp = (num2.charAt(j)-'0')*(num1.charAt(i)-'0');
                ans[k] = ans[k]+temp;
                ans[k-1] += ans[k]/10;
                ans[k] = ans[k] % 10;
                k--;
                //System.out.println(ans[k]+" "+ans[k-1]);
               // m =m+base*(temp%10);
                //base=base*10;
            }
            
           // System.out.println();
        }
        // for(int i=0;i<num2.length()+num1.length();i++)
        // {
        //     System.out.print(" "+ans[i]);
        // }
        for(int i=0;i<num2.length()+num1.length();i++)
        {
            
            while(ans[i]==0)
            {
                i++;
            }
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}
