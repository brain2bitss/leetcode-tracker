// Last updated: 2/2/2026, 2:34:30 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev;          // reverse pointer
            prev = curr;               // move prev
            curr = next;               // move curr
        }

        return prev; // new head
    }
}
