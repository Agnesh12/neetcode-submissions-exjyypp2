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
        
        ListNode NewHead;
        ListNode Slow = head;
        ListNode Fast = head;
        while(Fast != null && Fast.next != null) {
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
        NewHead = head;
        while(Prev != null) {
            ListNode Front = NewHead.next;
            ListNode NextPre = Prev.next;
            NewHead.next = Prev;
            Prev.next = Front;
            NewHead = Front;
            Prev = NextPre;
        }
        

    }
}
