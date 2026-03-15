// Last updated: 3/15/2026, 2:43:40 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int result = -1;int index = 0;
4        for(int i = 0;  i <= nums.length - 1; i++){
5            if(nums[i] >= target){
6                result = i;
7                break;
8            }
9            index = i;
10        }
11        if(result == -1){
12            result = index + 1;
13        }
14        return result;
15    }
16}