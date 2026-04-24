// Last updated: 4/24/2026, 11:39:56 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        // Base case
14        if (root == null || root == p || root == q) {
15            return root;
16        }
17
18        TreeNode left = lowestCommonAncestor(root.left, p, q);
19        TreeNode right = lowestCommonAncestor(root.right, p, q);
20
21        if (left != null && right != null) {
22            return root;
23        }
24
25        return left != null ? left : right;
26    }
27}
28