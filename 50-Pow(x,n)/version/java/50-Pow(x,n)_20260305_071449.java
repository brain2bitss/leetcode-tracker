// Last updated: 3/5/2026, 7:14:49 AM
1class Solution {
2    public double myPow(double x, int n) {
3        if (n == 0) return 1.0;
4
5        // Handle special case: 0 raised to negative power
6        if (x == 0 && n < 0) {
7            // mathematically undefined, decide how to handle
8            return Double.NaN; // or throw an exception
9        }
10
11        long exp = n;
12        if (exp < 0) {
13            x = 1 / x;
14            exp = -exp;
15        }
16
17        double result = 1.0;
18        while (exp > 0) {
19            if ((exp % 2) == 1) {
20                result *= x;
21            }
22            x *= x;
23            exp /= 2;
24        }
25
26        if (Double.isInfinite(result) || Double.isNaN(result)) {
27            return Double.NaN;
28        }
29
30        return result;
31    }
32}