// Last updated: 2/7/2026, 8:29:26 PM
1class Solution {
2    public void sortColors(int[] nums) {
3       int low = 0;          // boundary for 0s
4        int mid = 0;          // current element
5        int high = nums.length - 1; // boundary for 2s
6
7        while (mid <= high) {
8            if (nums[mid] == 0) {
9                // Swap nums[low] and nums[mid]
10                int temp = nums[low];
11                nums[low] = nums[mid];
12                nums[mid] = temp;
13                low++;
14                mid++;
15            } else if (nums[mid] == 1) {
16                // Leave 1s in the middle
17                mid++;
18            } else { // nums[mid] == 2
19                // Swap nums[mid] and nums[high]
20                int temp = nums[mid];
21                nums[mid] = nums[high];
22                nums[high] = temp;
23                high--;
24                // Do not increment mid here, because swapped element needs checking
25            }
26        }
27
28    }
29}