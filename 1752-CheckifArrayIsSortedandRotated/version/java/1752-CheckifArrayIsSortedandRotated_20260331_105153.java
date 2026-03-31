// Last updated: 3/31/2026, 10:51:53 AM
1class Solution {
2    public boolean check(int[] nums) {
3        int count = 0;
4        for(int i = 0; i < nums.length; i++){
5            if(nums[i] > nums[(i+1)% nums.length]){
6                count++;
7            }
8        }
9        return count <= 1;
10    }
11}