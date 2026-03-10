// Last updated: 3/10/2026, 3:24:07 PM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(result, new ArrayList<>(), n, k, 1);
5        return result;
6    }
7    
8    private void backtrack(List<List<Integer>> result, List<Integer> current, 
9                          int n, int k, int start) {
10
11        if (current.size() == k) {
12            result.add(new ArrayList<>(current));
13            return;
14        }
15        
16        // Try all possible next numbers
17        for (int i = start; i <= n; i++) {
18            // Add current number
19            current.add(i);
20            
21            
22            backtrack(result, current, n, k, i + 1);
23            
24            current.remove(current.size() - 1);
25        }
26    }
27}