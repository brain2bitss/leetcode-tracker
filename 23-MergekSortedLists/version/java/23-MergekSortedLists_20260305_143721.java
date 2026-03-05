// Last updated: 3/5/2026, 2:37:21 PM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        if (lists.length == 0) return null;
14        return mergeLists(lists, 0, lists.length - 1);
15    }
16
17    private ListNode mergeLists(ListNode[] lists, int left, int right) {
18        if (left == right) {
19            return lists[left];
20        }
21        int mid = left + (right - left) / 2;
22        ListNode l1 = mergeLists(lists, left, mid);
23        ListNode l2 = mergeLists(lists, mid + 1, right);
24        return mergeTwoLists(l1, l2);
25    }
26
27    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
28        if (l1 == null) return l2;
29        if (l2 == null) return l1;
30
31        if (l1.val < l2.val) {
32            l1.next = mergeTwoLists(l1.next, l2);
33            return l1;
34        } else {
35            l2.next = mergeTwoLists(l1, l2.next);
36            return l2;
37        }
38    }
39}