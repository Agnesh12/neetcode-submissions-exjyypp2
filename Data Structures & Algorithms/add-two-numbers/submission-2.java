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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Dummy = new ListNode(0);
        ListNode Temp = Dummy;
        int Carry = 0;
        while(l1 != null || l2 != null || Carry != 0) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int Val = v1 + v2 + Carry;
            Carry = Val / 10;
            Val = Val % 10;
            Temp.next = new ListNode(Val);
            Temp = Temp.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return Dummy.next;
        
    }
}
