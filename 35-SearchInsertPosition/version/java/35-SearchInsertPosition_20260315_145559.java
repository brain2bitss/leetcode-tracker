// Last updated: 3/15/2026, 2:55:59 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0; int right = nums.length - 1;
4        while(left <= right){
5            int mid = left + (right - left) / 2;
6            if(nums[mid] == target){
7                return mid;
8            }else if(nums[mid] < target){
9                left = mid + 1;
10            }else{
11                right = mid -1;
12            }
13        }
14        return left;
15    }
16}
17
18
19//The below program is correct but the time complexity of the program is o(n)
20
21//But the question asked to solve the problem with O(log n)
22
23//Using Binary search
24
25// class Solution {
26//     public int searchInsert(int[] nums, int target) {
27//         int result = -1;int index = 0;
28//         for(int i = 0;  i <= nums.length - 1; i++){
29//             if(nums[i] >= target){
30//                 result = i;
31//                 break;
32//             }
33//             index = i;
34//         }
35//         if(result == -1){
36//             result = index + 1;
37//         }
38//         return result;
39//     }
40// }