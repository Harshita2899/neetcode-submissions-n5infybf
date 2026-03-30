class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int small =nums1.length , large =nums2.length;
        int s=1;

        if(nums1.length>nums2.length)
        {
            small = nums2.length;
            large = nums1.length;
            s=2;
        }
        int[] sm =  new int[small];
        int[] lg = new int[large];
        int i1,i2,a1,a2,b1,b2;
        int start=0;
        int end= small;
        for(int i=0;i<small;i++)
        {
            if(s==1)
            {
                sm[i]=nums1[i];
            }
            else
            {
                sm[i]=nums2[i];
            }
        }
        for(int i=0;i<large;i++)
        {
            if(s==1)
            {
                lg[i]=nums2[i];
            }
            else
            {
                lg[i]=nums1[i];
            }
        }
        while(start<=end)
        {
            i1=(start+end)/2; 
            i2=((small+large+1)/2)-i1;
            a1 = (i1==0)?Integer.MIN_VALUE:sm[i1-1];
            a2 = (i1==small)?Integer.MAX_VALUE:sm[i1];
            b1 = (i2==0)?Integer.MIN_VALUE:lg[i2-1];
            b2 = (i2==large)?Integer.MAX_VALUE:lg[i2];
            if(a1<=b2 && a2>=b1)
            {
                if((small+large)%2!=0)
                {
                    return Math.max(a1,b1);
                }
                else
                {
                    return (Math.max(a1,b1)+Math.min(a2,b2))/2.0;
                }
            }
            else if(a1>b2)
            {
                end = i1-1;
            }
            else
            {
                start= i1+1;
            }
        }
    return 0;
    }
}
