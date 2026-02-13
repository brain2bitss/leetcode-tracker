// Last updated: 2/13/2026, 9:10:00 AM
1class Solution {
2    public int[] countBits(int n) {
3        int[] result = new int[n + 1];
4        
5        for (int i = 1; i <= n; i++) {
6            result[i] = result[i >> 1] + (i & 1);
7        }
8        
9        return result;
10    }
11}