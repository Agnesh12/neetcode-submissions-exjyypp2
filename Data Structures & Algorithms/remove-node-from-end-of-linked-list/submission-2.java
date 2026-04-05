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
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        ListNode First = head;
        while(n > 0) {
            n--;
            First = First.next;
        }
        while(First != null) {
            temp = temp.next;
            First = First.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}
