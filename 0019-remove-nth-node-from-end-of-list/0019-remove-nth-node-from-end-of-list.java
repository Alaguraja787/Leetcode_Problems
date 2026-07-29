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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode p2 = head;
        ListNode p1 = dummy;
        int count =0;
        while (p2 !=null){
            p2 = p2.next;
            count++;
            if (count>n){
                p1 = p1.next;
            }
        }
        p1.next = p1.next.next;
        return dummy.next;

    }
}