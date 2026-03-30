# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if n == 1 and not head.next:
            return None
        
        nth = head

        while n>0 and nth:
            nth = nth.next
            n = n-1

        if not nth or not nth.next :
            return head.next
        
        cur = head
        while nth.next:
            cur = cur.next
            nth = nth.next

        #print(cur.val)
        cur.next = cur.next.next
    
        return head