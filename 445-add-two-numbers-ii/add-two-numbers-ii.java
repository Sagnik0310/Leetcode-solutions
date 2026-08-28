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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr1 != null && curr2 != null){
            int sum = curr1.val + curr2.val + carry;
            if(sum > 9){
                curr.next = new ListNode(sum - 10);
                carry = 1;
            }
            else{
                curr.next = new ListNode(sum);
                carry = 0;
            }
            curr = curr.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while(curr1 != null){
            int sum = curr1.val + carry;
            if(sum > 9){
                curr.next = new ListNode(sum - 10);
                carry = 1;
            }
            else{
                curr.next = new ListNode(sum);
                carry = 0;
            }
            curr = curr.next;
            curr1 = curr1.next;
        }
        while(curr2 != null){
            int sum = curr2.val + carry;
            if(sum > 9){
                curr.next = new ListNode(sum - 10);
                carry = 1;
            }
            else{
                curr.next = new ListNode(sum);
                carry = 0;
            }
            curr = curr.next;
            curr2 = curr2.next;
        }
        if(carry == 1){
            curr.next = new ListNode(1);
        }
        ListNode head = reverseList(dummy.next);
        return head;
    }
}