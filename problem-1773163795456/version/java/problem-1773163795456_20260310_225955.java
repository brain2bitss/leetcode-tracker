// Last updated: 3/10/2026, 10:59:55 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        // Base cases
4        if (n <= 0) return false;
5        if (n == 1) return true;
6        return (n % 2 == 0) && isPowerOfTwo(n / 2);
7    }
8}