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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        ListNode tail = head;
        if(head==null ||head.next==null) return head;
        while(tail !=null && tail.next!=null){
            current = current.next;
            tail = tail.next.next;
           
        }return current;
    }
}