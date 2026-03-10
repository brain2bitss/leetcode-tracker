// Last updated: 3/10/2026, 1:15:20 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4        backtrack(result, "", 0, 0, n);
5        return result;
6    }
7    private void backtrack(List<String> result, String current, int open, int close, int n) {
8        if (current.length() == n * 2) {
9            result.add(current);
10            return;
11        }
12        
13        if (open < n) {
14            backtrack(result, current + "(", open + 1, close, n);
15        }
16                if (close < open) {
17            backtrack(result, current + ")", open, close + 1, n);
18        }
19    }
20}