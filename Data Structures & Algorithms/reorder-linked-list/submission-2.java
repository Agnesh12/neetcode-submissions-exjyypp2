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
        ListNode Slow = head;
        ListNode Fast = head;
        while(Fast != null && Fast.next !=  null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        ListNode Prev;
        ListNode Temp = Slow.next;
        Slow.next = Prev = null;
        
        while(Temp != null) {
            ListNode Front = Temp.next;
            Temp.next = Prev;
            Prev = Temp;
            Temp = Front;
        }
        ListNode NewHead = head;
        while(Prev != null) {
            ListNode Start = NewHead.next;
            ListNode End = Prev.next;
            NewHead.next = Prev;
            Prev.next = Start;
            NewHead = Start;
            Prev = End;
        }

    }
}
