// Last updated: 4/4/2026, 11:50:07 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result = 0;
4        for (int num : nums) {
5            result ^= num;
6        }
7        return result;
8    }
9}