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
    public ListNode reverseList(ListNode head)
    {
        ListNode temp;
        ListNode prev =null;
        ListNode curr =head;
        while(curr!=null)
        {
            temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        head = reverseList(head);
        if(n==1)
        {
            head = head.next;
        }
        else
        {
            ListNode curr= head;
            ListNode prev =null;
            int c=n;
            while(c>1 && curr!=null)
            {
                prev = curr;
                curr = curr.next;
                c--;
            }
            if(prev!= null && curr!=null)
            {
                prev.next = curr.next;
            }
    }
        return (reverseList(head));
    }
}
