// Last updated: 2/2/2026, 2:34:39 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = headB;int countt = 0;
        while(temp != null){
            countt++;
            temp = temp.next;
        }
        int movehead = Math.abs(count - countt);
        if(count > countt){
            for(int i =0; i < movehead; i++){
                headA = headA.next;
            }
        }else{
            for(int i =0; i < movehead; i++){
                headB = headB.next;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}