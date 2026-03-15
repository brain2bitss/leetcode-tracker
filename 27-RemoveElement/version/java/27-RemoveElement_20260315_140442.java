// Last updated: 3/15/2026, 2:04:42 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int k = 0; // index for placing non-val elements
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] != val) {
6                nums[k] = nums[i];
7                k++;
8            }
9        }
10        return k;
11    }
12}