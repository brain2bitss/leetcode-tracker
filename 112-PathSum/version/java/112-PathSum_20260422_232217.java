// Last updated: 4/22/2026, 11:22:17 PM
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
17    public boolean fun(TreeNode root, int res, int target){
18        if(root == null){
19            return false;
20        }
21        
22        res = res + root.val;
23        
24        if(root.left == null && root.right == null){
25            return res == target;
26        }
27        
28        return fun(root.left, res, target) || fun(root.right, res, target);
29    }
30    
31    public boolean hasPathSum(TreeNode root, int targetSum) {
32        return fun(root, 0, targetSum);
33    }
34}