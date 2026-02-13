// Last updated: 2/13/2026, 9:10:51 AM
1class Solution {
2    public int climbStairs(int n) {
3        if (n <= 2) return n;
4        
5        int first = 1, second = 2;
6        for (int i = 3; i <= n; i++) {
7            int third = first + second;
8            first = second;
9            second = third;
10        }
11        
12        return second;
13    }
14}