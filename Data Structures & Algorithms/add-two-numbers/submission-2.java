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
        ListNode ans = new ListNode();
        ListNode cur1= l1;
        ListNode cur2= l2;
        ListNode cur = ans;
        int carry =0;
        while(cur1!=null && cur2!=null)
        {
            int s= cur1.val+cur2.val+carry;
            carry = s/10;
            s= s%10;
            ListNode n  = new ListNode(s);
            if(cur==null)
            {
                cur=n;
            }
            else
            {
                cur.next = n;
                cur =cur.next;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        if(cur1!=null)
        {
            if(carry ==0)
            {
                cur.next = cur1;
            }
            else
            {
                while(carry!=0 && cur1!=null)
                {
                    int s = carry+ cur1.val;
                    carry = s/10;
                    s= s%10;
                    ListNode n  = new ListNode(s);
                    if(cur==null)
                    {
                        cur=n;
                    }
                    else
                    {
                        cur.next = n;
                        cur =cur.next;
                    }
                    cur1=cur1.next;

                }
                if(carry==1)
                {
                    ListNode n  = new ListNode(1);
                    cur.next = n;
                }
                if(cur1!=null)
                {
                    cur.next = cur1;
                }
            }
        }
        if(cur2!=null)
        {
            if(carry ==0)
            {
                cur.next = cur2;
            }
            else
            {
                while(carry!=0 && cur2!=null)
                {
                    int s = carry+ cur2.val;
                    carry = s/10;
                    s= s%10;
                    ListNode n  = new ListNode(s);
                    if(cur==null)
                    {
                        cur=n;
                    }
                    else
                    {
                        cur.next = n;
                        cur =cur.next;
                    }
                    cur2=cur2.next;
                }
                if(carry==1)
                {
                    ListNode n  = new ListNode(1);
                    cur.next = n;
                }
                if(cur2!=null)
                {
                    cur.next = cur2;
                }
            }
        }
        if(carry==1)
        {
            ListNode n  = new ListNode(1);
            cur.next = n;
        }
        return ans.next;
    }
}
