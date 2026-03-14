// Last updated: 3/14/2026, 7:54:00 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n <= 0 || n%6 == 0){
4            return false;
5        }
6        if(n == 1){
7            return true;
8        }
9        return function(n);
10    }
11    private boolean function(int n){
12        int length = (int) Math.log10(n) + 1;
13        if(length == 1){
14            if(n%3 == 0){
15                return true;
16            }else{
17                return false;
18            }
19        }else if(n%3 == 0){
20            n = n/3;
21            return function(n);
22        }
23        return false;
24    }
25    
26}