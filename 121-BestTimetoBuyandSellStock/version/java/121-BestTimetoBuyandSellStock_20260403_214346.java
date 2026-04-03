// Last updated: 4/3/2026, 9:43:46 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int minPrice = Integer.MAX_VALUE;  // Track the lowest price so far
4        int maxProfit = 0;                 // Track the maximum profit
5
6        for (int price : prices) {
7            if (price < minPrice) {
8                minPrice = price;          // Update minimum price
9            } else if (price - minPrice > maxProfit) {
10                maxProfit = price - minPrice;  // Update max profit
11            }
12        }
13
14        return maxProfit;
15    }
16}