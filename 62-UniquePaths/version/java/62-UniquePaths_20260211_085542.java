// Last updated: 2/11/2026, 8:55:42 AM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4        
5        // Initialize first row and column
6        for (int i = 0; i < m; i++) {
7            dp[i][0] = 1;
8        }
9        for (int j = 0; j < n; j++) {
10            dp[0][j] = 1;
11        }
12        
13        // Fill the table bottom-up
14        for (int i = 1; i < m; i++) {
15            for (int j = 1; j < n; j++) {
16                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
17            }
18        }
19        
20        return dp[m - 1][n - 1];
21    }
22}