// Last updated: 5/2/2026, 10:43:47 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isValidBST(TreeNode root) {
18        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
19    }
20    
21    private boolean validate(TreeNode node, long min, long max) {
22        if (node == null) {
23            return true;
24        }
25        if (node.val <= min || node.val >= max) {
26            return false;
27        }
28        return validate(node.left, min, node.val) && 
29               validate(node.right, node.val, max);
30    }
31}