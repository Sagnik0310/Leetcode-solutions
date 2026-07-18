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
    public ListNode middleFinder(ListNode head){
        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public void reorderList(ListNode head) {
        ListNode middle = middleFinder(head);
        ListNode second = reverseList(middle.next);
        middle.next = null;
        ListNode start = head;
        while(second != null){
            ListNode temp1 = start.next;
            ListNode temp2 = second.next;
            start.next = second;
            second.next = temp1;
            start = temp1;
            second = temp2;
        }
    }
}