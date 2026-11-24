# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: ListNode | None, list2: ListNode | None) -> ListNode | None:
        dummy = ListNode(0)
        temp = dummy
        p1 = list1
        p2 = list2
        while (p1 and p2):
            if (p1.val < p2.val):
                temp.next = ListNode(p1.val)
                p1 = p1.next
                temp = temp.next
            else:
                temp.next = ListNode(p2.val)
                p2 = p2.next
                temp = temp.next
        
        while p1:
            temp.next = ListNode(p1.val)
            p1 = p1.next
            temp = temp.next

        while p2:
            temp.next = ListNode(p2.val)
            p2 = p2.next
            temp = temp.next

        return dummy.next
                

        