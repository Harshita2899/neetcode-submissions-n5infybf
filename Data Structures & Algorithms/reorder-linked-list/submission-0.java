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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; // Edge case: empty or single-node list
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!= null)
        {
            slow = slow.next;
            fast =fast.next.next;
        }
        //reversing the second part of linked list 
        ListNode prev = null;
        
        ListNode curr = slow.next;
        slow.next = prev;

        ListNode temp;
        while (curr!=null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        slow = prev;
        fast = head;
        ListNode temp2;
        while(slow!=null)
        {
            temp2 = slow.next;
            temp = fast.next;
            fast.next =slow;
            slow.next = temp;
            fast = temp;
            slow = temp2;
        }
        
    }
}
