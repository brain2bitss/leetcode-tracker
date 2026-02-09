// Last updated: 2/9/2026, 9:01:21 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4        if (n == 0) return "";
5
6        boolean[][] dp = new boolean[n][n];
7        int start = 0, maxLen = 1;
8
9        // Every single character is a palindrome
10        for (int i = 0; i < n; i++) {
11            dp[i][i] = true;
12        }
13
14        // Check substrings of length 2
15        for (int i = 0; i < n - 1; i++) {
16            if (s.charAt(i) == s.charAt(i + 1)) {
17                dp[i][i + 1] = true;
18                start = i;
19                maxLen = 2;
20            }
21        }
22
23        // Check substrings of length >= 3
24        for (int len = 3; len <= n; len++) {
25            for (int i = 0; i <= n - len; i++) {
26                int j = i + len - 1;
27                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
28                    dp[i][j] = true;
29                    if (len > maxLen) {
30                        start = i;
31                        maxLen = len;
32                    }
33                }
34            }
35        }
36
37        return s.substring(start, start + maxLen);
38    }
39}