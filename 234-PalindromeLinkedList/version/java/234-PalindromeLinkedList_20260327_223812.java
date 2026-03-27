// Last updated: 3/27/2026, 10:38:12 PM
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
12
13    private ListNode front;
14    public boolean isPalindrome(ListNode head) {
15        front = head;
16        ListNode end = head;
17        return recursion(end);
18    }
19    private boolean recursion(ListNode end){
20        //move to the end
21        if(end == null){
22            return true;
23        }
24
25        if(!recursion(end.next)){
26            return false;
27        }
28
29        if(front.val != end.val){
30            return false;
31        }
32
33        front = front.next;
34        return true;
35    }
36}