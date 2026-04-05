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
    public ListNode Merge(ListNode[] lists,ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode Temp = dummy;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                Temp.next = list1;
                list1 = list1.next;
            }
            else {
                Temp.next = list2;
                list2 = list2.next;
            }
            Temp = Temp.next;
        }
        if(list1 != null) {
            Temp.next = list1;
        }
        else {
            Temp.next = list2;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        for(int i = 1; i < lists.length; i++) {
            lists[i] = Merge(lists, lists[i], lists[i - 1]);
        }
        return lists[lists.length - 1];
    }
}
