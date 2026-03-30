class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        Set <Integer> hs = new HashSet();
        while(!hs.contains(n))
        {
            
            if(n==1)
            {
                break;
            }
            hs.add(n);
            int temp = n;
            sum = 0;
            while(temp>0)
            {
                sum = sum + (int)Math.pow(temp%10,2);
                temp = temp/10;
            }
            n= sum;
            
        }
        return n==1;
    }
}
