// Last updated: 2/2/2026, 2:34:23 PM
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
    public ListNode reverse(ListNode head){
        ListNode new_head = null;
        ListNode curr = head;
        while(curr != null){
            ListNode node = new ListNode(curr.val);
            node.next = new_head;
            new_head = node;
            curr = curr.next;
        }
        return new_head;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode new_head = reverse(head);
        boolean value = false;
        while(new_head != null && head != null){
            if(new_head.val == head.val){
                new_head = new_head.next;
                head = head.next;
                value = true;
            }else{
                return false;
            }
        }
        return value;
    }
}