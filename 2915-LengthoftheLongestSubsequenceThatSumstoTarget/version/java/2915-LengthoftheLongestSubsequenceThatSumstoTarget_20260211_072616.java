// Last updated: 2/11/2026, 7:26:16 AM
1import java.util.*;
2
3class Solution {
4    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
5        int n = nums.size();
6        int[][] dp = new int[n + 1][target + 1];
7
8        // Initialize with -1 (not achievable)
9        for (int i = 0; i <= n; i++) {
10            Arrays.fill(dp[i], -1);
11        }
12        dp[0][0] = 0; // base case
13
14        for (int i = 1; i <= n; i++) {
15            int num = nums.get(i - 1);
16            for (int t = 0; t <= target; t++) {
17                // Case 1: don't take num
18                dp[i][t] = dp[i - 1][t];
19
20                // Case 2: take num
21                if (t >= num && dp[i - 1][t - num] != -1) {
22                    dp[i][t] = Math.max(dp[i][t], dp[i - 1][t - num] + 1);
23                }
24            }
25        }
26
27        return dp[n][target];
28    }
29}