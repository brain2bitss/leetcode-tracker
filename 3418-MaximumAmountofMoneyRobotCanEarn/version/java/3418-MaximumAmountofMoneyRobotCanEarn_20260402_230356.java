// Last updated: 4/2/2026, 11:03:56 PM
1class Solution {
2    public int maximumAmount(int[][] coins) {
3        int m = coins.length;
4        int n = coins[0].length;
5        // dp[i][j][k] = max sum to reach (i,j) using k neutralizations
6        Integer[][][] dp = new Integer[m][n][3];
7        return dfs(coins, 0, 0, 0, dp);
8    }
9    
10    private int dfs(int[][] coins, int i, int j, int used, Integer[][][] dp) {
11        // Base case: reached destination
12        if (i == coins.length - 1 && j == coins[0].length - 1) {
13            int val = coins[i][j];
14            if (val < 0 && used < 2) {
15                return 0; // Can neutralize this last coin
16            }
17            return val;
18        }
19        
20        if (dp[i][j][used] != null) return dp[i][j][used];
21        
22        int current = coins[i][j];
23        int maxSum = Integer.MIN_VALUE;
24        
25        // Try all possibilities for current cell
26        // Option 1: Take current value as is
27        int newUsed1 = used;
28        int value1 = current;
29        
30        // Option 2: Neutralize current (if negative and can still neutralize)
31        int newUsed2 = used;
32        int value2 = current;
33        if (current < 0 && used < 2) {
34            newUsed2 = used + 1;
35            value2 = 0;
36        }
37        
38        // Try moving right
39        if (j + 1 < coins[0].length) {
40            // Don't neutralize current
41            maxSum = Math.max(maxSum, value1 + dfs(coins, i, j + 1, newUsed1, dp));
42            // Neutralize current
43            if (current < 0 && used < 2) {
44                maxSum = Math.max(maxSum, value2 + dfs(coins, i, j + 1, newUsed2, dp));
45            }
46        }
47        
48        // Try moving down
49        if (i + 1 < coins.length) {
50            // Don't neutralize current
51            maxSum = Math.max(maxSum, value1 + dfs(coins, i + 1, j, newUsed1, dp));
52            // Neutralize current
53            if (current < 0 && used < 2) {
54                maxSum = Math.max(maxSum, value2 + dfs(coins, i + 1, j, newUsed2, dp));
55            }
56        }
57        
58        return dp[i][j][used] = maxSum;
59    }
60}