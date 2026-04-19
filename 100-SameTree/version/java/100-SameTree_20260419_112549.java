// Last updated: 4/19/2026, 11:25:49 AM
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if (p == null && q == null) {
19            return true;
20        }
21        if (p == null || q == null) {
22            return false;
23        }
24        if (p.val == q.val) {
25            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
26        } else {
27            return false;
28        }
29    }
30}