// Last updated: 4/18/2026, 11:47:48 PM
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
17    public TreeNode invertTree(TreeNode root) {
18        if(root == null){
19            return null;
20        }
21        
22        TreeNode temp = root.right;
23        root.right = root.left;
24        root.left = temp;
25
26        invertTree(root.left);
27        invertTree(root.right);
28
29        return root;
30    }
31}