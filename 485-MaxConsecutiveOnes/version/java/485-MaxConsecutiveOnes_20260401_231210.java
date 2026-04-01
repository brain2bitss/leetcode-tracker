// Last updated: 4/1/2026, 11:12:10 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3
4        int count = 0; int max = 0;
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == 1){
7                count++;
8                
9            }else{
10                if(count >= max){
11                    max = count;
12                }
13                count = 0;
14            }
15        }
16
17        if(count >= max){
18            max = count;
19        }
20        return max;
21    }
22}