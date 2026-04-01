// Last updated: 4/1/2026, 10:57:59 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        if(nums.length == 1)
4            return;
5        int index = 0; int count = 0;
6        for(int i = 0; i < nums.length; i++){
7            if(nums[i] != 0 && index < nums.length){
8                nums[index] = nums[i];
9                index++;
10            }else{
11                count++;
12            }
13        }
14        int li = nums.length - 1;
15        for(int i = count; i > 0; i--){
16            nums[li] = 0;
17            li--;
18        }
19    }
20}