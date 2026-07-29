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

        int length=0;
        while(current.next !=null){
            current = current.next;
            length++;
        }
        int middle = 0;
        if (length%2==0){
            middle = (length/2);
        }
        else{
            middle = (length/2)+1;
        }
        int count =0;
        current = head;
        while (count<middle){
            current = current.next;
            count++;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (current !=null){
            tail.next = new ListNode(current.val);
            tail = tail.next;
            current = current.next;
        }
        return dummy.next;
    }
}