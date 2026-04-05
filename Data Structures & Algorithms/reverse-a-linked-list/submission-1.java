/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     ListNode val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(ListNode val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode Pre = null;
        ListNode temp = head;
        while(temp != null) {
            ListNode Front = temp.next;
            temp.next = Pre;
            Pre = temp;
            temp = Front;
        }
        return Pre;
        
    }
}
