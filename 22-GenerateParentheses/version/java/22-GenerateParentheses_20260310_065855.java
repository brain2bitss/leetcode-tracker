// Last updated: 3/10/2026, 6:58:55 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> result = new ArrayList<>();
4        backtrack(result, "", 0, 0, n);
5        return result;
6    }
7    
8    private void backtrack(List<String> result, String current, int open, int close, int n) {
9        // If we have used all pairs (n pairs = 2n characters), add to result
10        if (current.length() == n * 2) {
11            result.add(current);
12            return;
13        }
14        
15        // We can add an opening parenthesis if we haven't used all n
16        if (open < n) {
17            backtrack(result, current + "(", open + 1, close, n);
18        }
19        
20        // We can add a closing parenthesis if we have more open than close
21        if (close < open) {
22            backtrack(result, current + ")", open, close + 1, n);
23        }
24    }
25}