// Last updated: 3/23/2026, 6:14:04 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] store = {-1, -1};
4        
5        int start = 0, end = nums.length - 1;
6        while (start <= end) {
7            int mid = (start + end) / 2;
8            if (nums[mid] < target) {
9                start = mid + 1;
10            } else {
11                end = mid - 1;
12            }
13            if (nums[mid] == target) {
14                store[0] = mid; 
15            }
16        }
17        
18        start = 0; end = nums.length - 1;
19        while (start <= end) {
20            int mid = (start + end) / 2;
21            if (nums[mid] > target) {
22                end = mid - 1;
23            } else {
24                start = mid + 1;
25            }
26            if (nums[mid] == target) {
27                store[1] = mid; 
28            }
29        }
30        
31        return store;
32    }
33}