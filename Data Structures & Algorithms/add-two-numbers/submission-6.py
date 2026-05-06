# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry=0
        c1=l1
        c2=l2
        sol=None
        returnVal=None
        while c1 and c2 :
            v1=c1.val
            v2=c2.val
            sum_ans=v1+v2+carry
            carry=sum_ans//10
            sum_ans=sum_ans%10
            if sol==None:
                sol = ListNode(sum_ans)
                returnVal=sol
            else:
                sol.next=ListNode(sum_ans)
                sol=sol.next
            c1=c1.next
            c2=c2.next

        while c1:
            v1=c1.val
            sum_ans=v1+carry
            carry=sum_ans//10
            sum_ans=sum_ans%10
            if sol==None:
                sol = ListNode(sum_ans)
                returnVal=sol
            else:
                sol.next=ListNode(sum_ans)
                sol=sol.next
            c1=c1.next

        while c2:
            v1=c2.val
            sum_ans=v1+carry
            carry=sum_ans//10
            sum_ans=sum_ans%10
            if sol==None:
                sol = ListNode(sum_ans)
                returnVal=sol
            else:
                sol.next=ListNode(sum_ans)
                sol=sol.next
            c2=c2.next
        
        if carry==1:
            sol.next=ListNode(1)
        return returnVal
