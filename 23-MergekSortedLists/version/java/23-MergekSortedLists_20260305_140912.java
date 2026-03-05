// Last updated: 3/5/2026, 2:09:12 PM
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
17    // Recursively merge lists between indices left and right
18    private ListNode mergeLists(ListNode[] lists, int left, int right) {
19        if (left == right) {
20            return lists[left];
21        }
22        int mid = left + (right - left) / 2;
23        ListNode l1 = mergeLists(lists, left, mid);
24        ListNode l2 = mergeLists(lists, mid + 1, right);
25        return mergeTwoLists(l1, l2);
26    }
27
28    // Merge two sorted linked lists
29    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
30        if (l1 == null) return l2;
31        if (l2 == null) return l1;
32
33        if (l1.val < l2.val) {
34            l1.next = mergeTwoLists(l1.next, l2);
35            return l1;
36        } else {
37            l2.next = mergeTwoLists(l1, l2.next);
38            return l2;
39        }
40    }
41}