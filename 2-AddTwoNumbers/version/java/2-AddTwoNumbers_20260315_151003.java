// Last updated: 3/15/2026, 3:10:03 PM
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
11
12 //ADITHYA G
13 
14class Solution {
15    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
16        return add(l1, l2, 0);
17    }
18    private ListNode add(ListNode l1, ListNode l2, int carry){
19        if(l1 == null && l2 == null && carry == 0){
20            return null;
21        }
22        int sum = carry;
23        if(l1 != null){
24            sum += l1.val;
25        }
26        if(l2 != null){
27            sum += l2.val;
28        }
29
30        ListNode result = new ListNode(sum % 10);
31        ListNode next1 = (l1 != null) ? l1.next : null;
32        ListNode next2 = (l2 != null) ? l2.next : null;
33
34        result.next = add(next1, next2, sum / 10);
35        return result;
36    }
37}