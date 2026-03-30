# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        cur1 = l1
        cur2 = l2
        prev = None
        temp =None
        while cur1 and cur2:
            sum_val = cur1.val +cur2.val+carry
            cur1.val = sum_val%10
            carry = sum_val//10

            prev = cur1
            cur1 = cur1.next
            cur2 = cur2.next
        
        if cur2:
            prev.next = cur2
            cur1 = cur2

        while cur1:
            sum_val = cur1.val +carry
            cur1.val = sum_val%10
            carry = sum_val//10
            prev = cur1
            cur1 = cur1.next

        
        if carry==1:
    
            prev.next = ListNode(1,None)
        
        return l1
