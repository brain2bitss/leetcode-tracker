// Last updated: 2/5/2026, 2:36:34 AM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int INF = (int) 1e9;
4        int[] dp = new int[amount + 1];
5
6        for (int j = 1; j <= amount; j++) {
7            dp[j] = INF;
8        }
9
10        dp[0] = 0;
11
12        for (int coin : coins) {
13            for (int j = coin; j <= amount; j++) {
14                dp[j] = Math.min(dp[j], 1 + dp[j - coin]);
15            }
16        }
17
18        return dp[amount] >= INF ? -1 : dp[amount];
19    }
20}
21