// Last updated: 4/9/2026, 11:39:33 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        if(nums[left] == target){
5            return 0;
6        }
7        int right = nums.length - 1;
8        int mid = 0; int result = -1;
9        while(left <= right){
10            mid = (left + right) / 2;
11            if(nums[mid] == target){
12                result = mid;
13                break;
14            }else if(nums[mid] < target){
15                left = mid + 1;
16            }else{
17                right = mid - 1;
18            }
19        }
20        return result;
21    }
22}