// Last updated: 3/10/2026, 3:25:18 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(result, new ArrayList<>(), candidates, target, 0);
5        return result;
6    }
7    
8    private void backtrack(List<List<Integer>> result, List<Integer> current, 
9                          int[] candidates, int remaining, int start) {
10        if (remaining < 0) {
11            return;
12        }
13        
14        if (remaining == 0) {
15            result.add(new ArrayList<>(current));
16            return;
17        }
18        
19        for (int i = start; i < candidates.length; i++) {
20            current.add(candidates[i]);
21            backtrack(result, current, candidates, remaining - candidates[i], i);
22            current.remove(current.size() - 1);
23        }
24    }
25}