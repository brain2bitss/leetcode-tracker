// Last updated: 4/23/2026, 11:36:53 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> result = new ArrayList<>();
19        dfs(root, 0, result);
20        return result;
21    }
22    
23    private void dfs(TreeNode node, int level, List<List<Integer>> result) {
24        if (node == null) {
25            return;
26        }
27    
28        if (result.size() == level) {
29            result.add(new ArrayList<>());
30        }
31        
32        result.get(level).add(node.val);
33        
34        dfs(node.left, level + 1, result);
35        dfs(node.right, level + 1, result);
36    }
37}