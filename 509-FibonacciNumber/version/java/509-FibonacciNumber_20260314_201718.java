// Last updated: 3/14/2026, 8:17:18 PM
1class Solution {
2    public int fib(int n) {
3        
4        int result = 0;
5        return fibonacci(n, result);
6    }
7    private int fibonacci(int n, int result){
8        if(n == 0){
9            return 0;
10        }
11        if(n == 1){
12            return 1;
13        }
14        result = fibonacci(n - 1,result) + fibonacci(n - 2,result);
15        return result;
16    }
17}