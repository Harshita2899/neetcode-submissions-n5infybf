# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:

    def findMid(self,head):
        slow = head
        fast = head
        
        while fast and fast.next:
            
            fast = fast.next.next
            slow = slow.next

        return slow

    def reverse(self,head):
        prev = None
        curr = head

        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        return prev

    def reorder(self,head,head1):
        cur = head
        cur2 = head1
                
        while cur and cur2:
            temp = cur.next
            temp2 = cur2.next
            cur.next = cur2
            cur2.next = temp

            cur = temp
            cur2 = temp2

        

        return head

    def reorderList(self, head: Optional[ListNode]) -> None:
        if not head or not head.next:
            return
        mid = self.findMid(head)

        #print(mid.val)
        m1 = mid.next

        mid.next = None
        m2 = self.reverse(m1)

        self.reorder(head,m2)