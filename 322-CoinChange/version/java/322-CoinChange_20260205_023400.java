// Last updated: 2/5/2026, 2:34:00 AM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int n = coins.length;
4        int INF = (int) 1e9;
5
6        // dp[i][j] = min coins to make amount j using first i coins
7        int[][] dp = new int[n + 1][amount + 1];
8
9        // Base case: no coins
10        for (int j = 1; j <= amount; j++) {
11            dp[0][j] = INF;
12        }
13
14        // Base case: amount = 0
15        for (int i = 0; i <= n; i++) {
16            dp[i][0] = 0;
17        }
18
19        // Fill DP table
20        for (int i = 1; i <= n; i++) {
21            for (int j = 1; j <= amount; j++) {
22                if (coins[i - 1] > j) {
23                    dp[i][j] = dp[i - 1][j];
24                } else {
25                    dp[i][j] = Math.min(
26                        dp[i - 1][j],
27                        1 + dp[i][j - coins[i - 1]]
28                    );
29                }
30            }
31        }
32
33        return dp[n][amount] >= INF ? -1 : dp[n][amount];
34    }
35}
36