// Last updated: 3/10/2026, 2:14:51 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(result, new ArrayList<>(), nums);
5        return result;
6    }
7    
8    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums) {
9        if (current.size() == nums.length) {
10            result.add(new ArrayList<>(current));
11            return;
12        }
13            for (int i = 0; i < nums.length; i++) {
14            int num = nums[i];
15            
16            if (current.contains(num)) {
17                continue;
18            }
19            
20                current.add(num);
21            
22            backtrack(result, current, nums);
23            
24            current.remove(current.size() - 1);
25        }
26    }
27}