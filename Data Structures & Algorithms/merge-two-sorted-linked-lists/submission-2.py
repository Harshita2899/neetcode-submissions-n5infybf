# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1:
            return list2
        elif not list2:
            return list1
        else:
            headans = None
            curans = None
            while list1 and list2:
                if list1.val<list2.val:
                    if not headans:
                        headans = list1
                        curans = list1
                    else:
                        curans.next = list1
                        curans = curans.next
                    list1= list1.next

                else:
                    if not headans:
                        headans = list2
                        curans = list2
                    else:
                        curans.next = list2
                        curans = curans.next

                    list2= list2.next

            if list1:
                curans.next = list1
            elif list2:
                curans.next = list2

            return headans;