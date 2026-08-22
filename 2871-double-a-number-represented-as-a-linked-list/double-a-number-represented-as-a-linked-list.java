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
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverseList(head);
        int carry = 0;
        ListNode curr = head;
        while(curr != null){
            int value = curr.val*2+carry;
            if(value<10){
                curr.val = value;
                carry = 0;
            }
            else if(curr.next == null && value>9){
                curr.val = value - 10;
                curr.next = new ListNode(1);
                break;
            }
            else{
                curr.val = value - 10;
                carry = 1;
            }
            curr = curr.next;
        }
        head = reverseList(head);
        return head;
    }
}