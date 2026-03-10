// Last updated: 3/10/2026, 6:59:45 AM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result = new ArrayList<>();
4        backtrack(result, new ArrayList<>(), s, 0);
5        return result;
6    }
7    
8    private void backtrack(List<List<String>> result, List<String> current, String s, int start) {
9        // If we've reached the end of the string, add the current partition to result
10        if (start == s.length()) {
11            result.add(new ArrayList<>(current));
12            return;
13        }
14        
15        // Try all possible substrings starting from 'start'
16        for (int end = start; end < s.length(); end++) {
17            // If the substring from start to end is a palindrome
18            if (isPalindrome(s, start, end)) {
19                // Add the palindrome substring to current list
20                current.add(s.substring(start, end + 1));
21                // Recurse for the remaining string
22                backtrack(result, current, s, end + 1);
23                // Backtrack by removing the last added substring
24                current.remove(current.size() - 1);
25            }
26        }
27    }
28    
29    private boolean isPalindrome(String s, int left, int right) {
30        while (left < right) {
31            if (s.charAt(left) != s.charAt(right)) {
32                return false;
33            }
34            left++;
35            right--;
36        }
37        return true;
38    }
39}