// Last updated: 3/13/2026, 7:08:47 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        return add(l1, l2, 0);
14    }
15    private ListNode add(ListNode l1, ListNode l2, int carry){
16        if(l1 == null && l2 == null && carry == 0){
17            return null;
18        }
19        int sum = carry;
20        if(l1 != null){
21            sum += l1.val;
22        }
23        if(l2 != null){
24            sum += l2.val;
25        }
26
27        ListNode result = new ListNode(sum % 10);
28        ListNode next1 = (l1 != null) ? l1.next : null;
29        ListNode next2 = (l2 != null) ? l2.next : null;
30
31        result.next = add(next1, next2, sum / 10);
32        return result;
33    }
34}