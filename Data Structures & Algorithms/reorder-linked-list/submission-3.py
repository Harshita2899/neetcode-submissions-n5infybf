# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def findMid(self,head):
        slow=head
        fast=head
        while fast and fast.next:
            fast = fast.next.next
            slow =slow.next
        return slow

    def reverse(self,head):
        prev=None
        cur =head
        while cur :
            temp =cur.next
            cur.next = prev
            prev=cur
            cur =temp
        return prev

    def reorder(self,m1,m2):
        c1=m1
        c2=m2

        while c1 and c2:
            t1=c1.next
            t2=c2.next

            c1.next = c2
            c2.next = t1

            c1 =t1
            c2=t2
        
        if c2:
            c1.next=c2
        
        return m1

    def reorderList(self, head: Optional[ListNode]) -> None:
        mid =self.findMid(head)

        m1 =mid.next
        mid.next = None
        rev = self.reverse(m1)
        self.reorder(head,rev)