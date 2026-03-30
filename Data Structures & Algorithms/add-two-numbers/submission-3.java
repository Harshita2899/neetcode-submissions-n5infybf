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
        else if (l2==null)
        {
            return l1;
        }
        ListNode h1 = null;
        ListNode ans = null;
        int carry =0;
        while((l1!=null) && (l2!=null))
        {
            int chk = l1.val+l2.val+carry;
            int value = chk%10;
            carry = chk/10;
            ListNode temp = new ListNode(value);
            if(ans==null)
            {
                ans=temp;
                h1=ans;
            }
            else
            {
                ans.next = temp;
                ans = ans.next;
            }
            l1=l1.next;
            l2=l2.next;

        }
        while(l1!=null)
        {
            int chk = l1.val+carry;
            int value = chk%10;
            carry = chk/10;
            ListNode temp = new ListNode(value);
            ans.next = temp;
            ans = ans.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            int chk = l2.val+carry;
            int value = chk%10;
            carry = chk/10;
            ListNode temp = new ListNode(value);
            ans.next = temp;
            ans = ans.next;
            l2=l2.next;
        }
        if(carry!=0)
        {
            ListNode temp = new ListNode(carry);
            ans.next = temp;
        }
        return h1;
    }
}
