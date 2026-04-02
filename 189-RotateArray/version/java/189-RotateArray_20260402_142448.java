// Last updated: 4/2/2026, 2:24:48 PM
1class Solution {
2    //CODED BY ADHI
3    public void rotate(int[] nums, int k) {
4        int n = nums.length;
5
6        //BASE CASE
7        if(n == 1 || n == 0){
8            return;
9        }
10
11        int F = 0; int E = n - 1;
12
13        //BASE CASE
14         k = k % n;
15        if(k == 0) return;
16
17        //REVERSE THE ENTIRE ARRAY 
18        function(nums, n, F, E);
19
20        
21
22        //REVERSE THE FIRST PART OF THE 
23        F = 0; E = k - 1;
24        function(nums, k, F, E);
25
26        //REVERSE REMAINING PART OF THE ARRAY
27        F = k; E = n - 1;
28        int rem_length = n - k;
29        function(nums, rem_length, F, E);
30    }
31    private void function(int[] nums, int n, int F, int E){
32        for(int i = 0; i < n; i++){
33            int temp = nums[F];
34            nums[F] = nums[E];
35            nums[E] = temp; 
36            F++;
37            E--;
38            if(F == E ||  F > E){
39                break;
40            }
41        }
42    }
43}