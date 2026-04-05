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
    public void reorderList(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
       }
       ListNode second = slow.next;
       ListNode pre = slow.next = null;
       while(second != null) {
        ListNode front = second.next;
        second.next = pre;
        pre = second;
        second = front;
       }
       ListNode firstHead = head;
       ListNode secondHead = pre;
       while(secondHead != null) {
        ListNode firstFront = firstHead.next;
        ListNode secondFront = secondHead.next;
        firstHead.next = secondHead;
        secondHead.next = firstFront;
        firstHead = firstFront;
        secondHead = secondFront;
       }

    }
}
