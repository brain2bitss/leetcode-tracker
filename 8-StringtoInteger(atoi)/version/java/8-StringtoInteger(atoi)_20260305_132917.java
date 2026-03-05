// Last updated: 3/5/2026, 1:29:17 PM
1class Solution {
2    public int myAtoi(String s) {
3        if (s == null || s.length() == 0) return 0;
4
5        int i = 0, n = s.length();
6        
7        while (i < n && s.charAt(i) == ' ') {
8            i++;
9        }
10
11       
12        int sign = 1;
13        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
14            sign = (s.charAt(i) == '-') ? -1 : 1;
15            i++;
16        }
17
18        long result = 0; 
19        while (i < n && Character.isDigit(s.charAt(i))) {
20            result = result * 10 + (s.charAt(i) - '0');
21
22            // Step 4: Clamp to int range
23            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
24            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
25
26            i++;
27        }
28
29        return (int) (sign * result);
30    }
31}