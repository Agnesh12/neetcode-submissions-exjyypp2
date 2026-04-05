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
    public ListNode Merge(ListNode Current, ListNode Prev) {
       ListNode dummy = new ListNode(0);
       ListNode temp = dummy;
       while(Current != null && Prev != null) {
        if(Current.val < Prev.val) {
            temp.next = Current;
            Current = Current.next;
        }
        else {
            temp.next = Prev;
            Prev = Prev.next;
        }
        temp = temp.next;
       }
       if(Current != null) {
        temp.next = Current;
       }
       else {
        temp.next = Prev;
       }
       return dummy.next;
            
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        for(int i = 1; i < lists.length; i++) {
            lists[i] = Merge(lists[i], lists[i - 1]);
        }
        return lists[lists.length - 1];
    }
}
