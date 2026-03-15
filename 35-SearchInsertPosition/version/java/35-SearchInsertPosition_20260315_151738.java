// Last updated: 3/15/2026, 3:17:38 PM
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
14        return right + 1;
15        //instead of right + 1; we can also return as left;
16    }
17}
18
19
20//The below program is correct but the time complexity of the program is o(n)
21
22//But the question asked to solve the problem with O(log n)
23
24//Using Binary search
25
26// class Solution {
27//     public int searchInsert(int[] nums, int target) {
28//         int result = -1;int index = 0;
29//         for(int i = 0;  i <= nums.length - 1; i++){
30//             if(nums[i] >= target){
31//                 result = i;
32//                 break;
33//             }
34//             index = i;
35//         }
36//         if(result == -1){
37//             result = index + 1;
38//         }
39//         return result;
40//     }
41// }