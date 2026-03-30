/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        int carry =0;
        ListNode prevc=l1, prevl2=l2;
        int sum =0;
        ListNode curr =l1;
        while(curr!=null && l2!=null)
        {
            prevc = curr;
            prevl2 =l2;
            sum = curr.val+l2.val+carry;
            if(sum>9)
            {
                carry=1;
                sum = sum%10;
            }
            else
            {
                carry =0;
            }
            curr.val = sum;
            curr= curr.next;
            l2= l2.next;
        }
        while(carry == 1 )
        {
            sum =0;
            if(curr!=null)
            {
                sum = curr.val+1;
            }
            else if(l2!=null)
            {
                sum  = l2.val+1;
                
            }
            else
            {
                prevc.next = new ListNode(1);
                break;
            }
            if(sum>10)
            {
                carry = 1;
                sum =sum%10;
            }
            else
            {
                carry =0;
            }
            if(curr!=null)
            {
                sum = curr.val+1;
                curr =curr.next;
            }
            else
            {
                sum  = l2.val+1;
                prevc.next = l2;
                prevc= l2;
                l2=l2.next;
            }
        }
        if(carry==0)
        {
            if(l2!=null)
            {
                
                prevc.next = l2;
            }
        }
        return l1;
    }
}
