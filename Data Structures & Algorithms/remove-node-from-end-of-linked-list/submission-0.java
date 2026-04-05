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
        ListNode StartLeft = new ListNode(0, head);
        ListNode Left = StartLeft;
        ListNode Right = head;
        while(n > 0) {
            Right = Right.next;
            n--;
        }
        while(Right != null) {
            Left = Left.next;
            Right = Right.next;
        }
        Left.next = Left.next.next;
        return StartLeft.next;


    }
}
