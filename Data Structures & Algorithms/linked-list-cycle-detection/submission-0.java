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
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do
        {
            fast= fast.next.next;
            slow = slow.next;
        }while(fast!=null && fast.next!=null && fast!=slow);
        if (fast== null || fast.next==null)
        {
            return false;
        }
        return true;
    }
}
