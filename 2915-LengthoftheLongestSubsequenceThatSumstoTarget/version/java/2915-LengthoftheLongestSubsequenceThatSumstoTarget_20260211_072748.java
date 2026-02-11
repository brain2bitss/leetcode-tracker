// Last updated: 2/11/2026, 7:27:48 AM
1import java.util.*;
2
3class Solution {
4    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
5        int n = nums.size();
6        int[][] dp = new int[n + 1][target + 1];
7
8        for (int i = 0; i <= n; i++) {
9            Arrays.fill(dp[i], -1);
10        }
11
12        dp[0][0] = 0; 
13
14        for (int i = 1; i <= n; i++) {
15            int num = nums.get(i - 1);
16            
17            for (int t = 0; t <= target; t++) {
18                dp[i][t] = dp[i - 1][t];
19
20                if (t >= num && dp[i - 1][t - num] != -1) {
21                    dp[i][t] = Math.max(dp[i][t], dp[i - 1][t - num] + 1);
22                }
23            }
24        }
25
26        return dp[n][target];
27    }
28}