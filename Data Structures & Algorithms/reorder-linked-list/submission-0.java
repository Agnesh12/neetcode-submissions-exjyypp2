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
            while(Fast != null && Fast.next != null) {
                Slow = Slow.next;
                Fast = Fast.next.next;
            }  
            ListNode Start = Slow.next;
            ListNode Prev = Slow.next = null;
            while(Start != null) {
                ListNode Temp = Start.next;
                Start.next = Prev;
                Prev = Start;
                Start = Temp;
            }
            ListNode First = head;
            ListNode Second = Prev;
            while(Second != null) {
                ListNode tmp1 = First.next;
                ListNode tmp2 = Second.next;
                First.next = Second;
                Second.next = tmp1;
                First = tmp1;
                Second = tmp2;
            }

    }
}
