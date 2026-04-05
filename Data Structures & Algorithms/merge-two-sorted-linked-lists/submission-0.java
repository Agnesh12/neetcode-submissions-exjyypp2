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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode L1Head = list1;
        ListNode L2Head = list2;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(L1Head != null && L2Head != null) {
            if(L1Head.val  < L2Head.val) {
                node.next = L1Head;
                L1Head = L1Head.next;
            }
            else {
                node.next = L2Head;
                L2Head = L2Head.next;
            }
            node = node.next;
        }
        if(L1Head != null) {
            node.next = L1Head;
        }
        else {
            node.next = L2Head;
        }
        return dummy.next;
        
    }
}