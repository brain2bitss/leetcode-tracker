// Last updated: 3/10/2026, 1:15:07 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result = new ArrayList<>();
4        backtrack(result, new ArrayList<>(), s, 0);
5        return result;
6    }
7    
8    private void backtrack(List<List<String>> result, List<String> current, String s, int start) {
9        if (start == s.length()) {
10            result.add(new ArrayList<>(current));
11            return;
12        }
13        
14        
15        for (int end = start; end < s.length(); end++) {
16            if (isPalindrome(s, start, end)) {
17                current.add(s.substring(start, end + 1));
18                backtrack(result, current, s, end + 1);
19                current.remove(current.size() - 1);
20            }
21        }
22    }
23    
24    private boolean isPalindrome(String s, int left, int right) {
25        while (left < right) {
26            if (s.charAt(left) != s.charAt(right)) {
27                return false;
28            }
29            left++;
30            right--;
31        }
32        return true;
33    }
34}