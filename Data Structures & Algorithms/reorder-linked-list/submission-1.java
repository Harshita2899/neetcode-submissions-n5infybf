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
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr!=null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rev = reverseList(slow.next);
        slow.next =null;
        ListNode cur = head;
        while(rev!=null)
        {
            ListNode temp1 = cur.next;
            ListNode temp2 = rev.next;
            cur.next = rev;
            rev = temp2;
            cur=cur.next;
            cur.next =temp1;
            cur =cur.next;

        }
    }
}
