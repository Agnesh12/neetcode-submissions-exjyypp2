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
    public ListNode reverseList(ListNode head) {
        ListNode tempHead = head;
        ListNode rev = null;
        while(tempHead != null) {
            ListNode front = tempHead.next;
            tempHead.next = rev;
            rev = tempHead;
            tempHead = front;
        }
        return rev;
    }
}
