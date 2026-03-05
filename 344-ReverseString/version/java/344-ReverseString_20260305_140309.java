// Last updated: 3/5/2026, 2:03:09 PM
1class Solution {
2    public void reverse(char[] s, int left, int right) {
3        if (left < right) {
4            char temp = s[left];
5            s[left] = s[right];
6            s[right] = temp;
7            reverse(s, left + 1, right - 1);
8        }
9    }
10
11    public void reverseString(char[] s) {
12        int left = 0;
13        int right = s.length - 1;
14        reverse(s, left, right);
15    }
16}