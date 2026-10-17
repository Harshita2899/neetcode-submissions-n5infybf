# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    

    def reorderList(self, head: Optional[ListNode]) -> None:
        def findmid(head):
            slow=head
            fast=head
            while fast and fast.next:
                slow = slow.next
                fast = fast.next.next
            return slow

        def reverseLL(head):
            prev = None
            cur =head
            while cur :
                tmp = cur.next
                cur.next=prev
                prev=cur
                cur=tmp
            return prev

        def combine(head,head1):
            cur =head 
            cur1=head1
            while cur and cur1:
                temp =cur.next
                cur.next = cur1
                cur=temp
                temp2 =cur1.next
                cur1.next=cur
                cur1 = temp2
               
            return head
                



        head1 = findmid(head)
        temp = head1.next
        head1.next = None
        head1 = reverseLL(temp)
        head = combine(head,head1)

        
        