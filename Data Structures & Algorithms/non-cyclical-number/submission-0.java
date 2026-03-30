class Solution {
    public boolean isHappy(int n) {
        List <Integer> a = new ArrayList();
        int num=0;
        while(n!=1)
        {
            num=n;
            n=0;
            if(a.contains(num))
            {
                break;
            }
            a.add(num);
            while(num>0)
            {
                n = n + (num%10)*(num%10);
                num= num/10;
            }

        } 
        return n==1;
    }
}
