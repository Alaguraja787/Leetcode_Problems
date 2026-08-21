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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupprev = dummy;

        while(true){
            ListNode kth = groupprev;
            for (int i=0; i<k; i++){
                kth = kth.next;

                if (kth==null){
                    return dummy.next;
                }
            }
            ListNode groupnext = kth.next;
            ListNode curr = groupprev.next;
            ListNode prev = groupnext;

            while(curr !=groupnext){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = groupprev.next;
            groupprev.next = kth;

            groupprev = temp;

        }
    }
}