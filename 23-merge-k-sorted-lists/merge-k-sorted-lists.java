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
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1 == null && l2 == null) return null;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(p1 != null && p2 != null){
            if(p1.val<=p2.val){
                curr.next = p1;
                p1 = p1.next;
                curr = curr.next;
            }
            else{
                curr.next = p2;
                p2 = p2.next;
                curr = curr.next;
            }
        }
        while(p1 != null){
            curr.next = p1;
            curr = curr.next;
            p1 = p1.next;
        }
        while(p2 != null){
            curr.next = p2;
            p2 = p2.next;
            curr = curr.next;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode res = lists[0];
        for(int i = 1;i<lists.length;i++){
            res = merge(res,lists[i]);
        }
        return res;
    }
}