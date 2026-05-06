# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self,head):
        prev =None
        cur =head
        while cur:
            temp = cur.next
            cur.next = prev
            prev= cur
            cur = temp
        return prev
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        if left == right:
            return head
        
        prevPointer=None
        nextPointer=None

        cur=head
        cnt=1
        

        while cnt<left:
            if prevPointer is None:
                prevPointer = head
            else:
                prevPointer = prevPointer.next
            cnt+=1

        if left==1:
            cur=head
        else:
            cur=prevPointer.next
        
        revStart = cur
        dif = right-left
        while dif>0:
            cur =cur.next
            dif-=1
        nextPointer=cur.next
        cur.next=None
        rev = self.reverse(revStart)
        if prevPointer is None:
            head = rev
        else:
            prevPointer.next = rev
        dif = right-left
        while dif>0:
            cur =cur.next
            dif-=1
        cur.next=nextPointer
        return head
