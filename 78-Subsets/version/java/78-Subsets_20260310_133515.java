// Last updated: 3/10/2026, 1:35:15 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(result, new ArrayList<>(), nums, 0);
5        return result;
6    }
7    
8    private void backtrack(List<List<Integer>> result, List<Integer> current, 
9                          int[] nums, int start) {
10        result.add(new ArrayList<>(current));
11        for (int i = start; i < nums.length; i++) {
12            current.add(nums[i]);
13            
14            backtrack(result, current, nums, i + 1);
15            
16            current.remove(current.size() - 1);
17        }
18    }
19}