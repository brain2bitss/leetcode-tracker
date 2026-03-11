// Last updated: 3/11/2026, 8:10:26 AM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        Set<String> wordSet = new HashSet<>(wordDict);
4        Map<Integer, Boolean> memo = new HashMap<>();
5        return backtrack(s, wordSet, 0, memo);
6    }
7    
8    private boolean backtrack(String s, Set<String> wordSet, int start, Map<Integer, Boolean> memo) {
9        if (start == s.length()) {
10            return true;
11        }
12        
13        if (memo.containsKey(start)) {
14            return memo.get(start);
15        }
16        
17        for (int end = start + 1; end <= s.length(); end++) {
18            String word = s.substring(start, end);
19            if (wordSet.contains(word) && backtrack(s, wordSet, end, memo)) {
20                memo.put(start, true);
21                return true;
22            }
23        }
24        
25        memo.put(start, false);
26        return false;
27    }
28}