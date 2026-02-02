// Last updated: 2/2/2026, 2:34:36 PM
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;        // count multiples of 5, 25, 125, ...
            count += n;
        }
        return count;
    }
}
