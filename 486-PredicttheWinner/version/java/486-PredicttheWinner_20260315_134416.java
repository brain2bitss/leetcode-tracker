// Last updated: 3/15/2026, 1:44:16 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int first_element = 0;
4        int last_element = nums.length - 1;
5        int result = diff(nums, first_element, last_element);
6        if(result >= 0){
7            return true;
8        }else{
9            return false;
10        }
11    }
12    private int diff(int[] nums, int a, int z){
13
14        if(a == z){
15            return nums[a];
16        }
17        //case 1 : what if the person 1 chooses the first element
18        int net_gain_1 = nums[a] - diff(nums, a + 1, z);
19
20        //case 2 :  what if the person 1 chooses the last element
21        int net_gain_2 = nums[z] - diff(nums, a, z - 1);
22        return (int)Math.max(net_gain_1, net_gain_2);
23
24    }
25}