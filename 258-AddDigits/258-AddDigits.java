// Last updated: 2/2/2026, 2:34:22 PM
class Solution {
    public int problem(int n) {
        // Base case: if n is a single digit, return it
        if (n < 10) {
            return n;
        }

        int sum = 0;
        // Sum all digits of n
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        // Recursive call until we reach a single digit
        return problem(sum);
    }

    public int addDigits(int num) {
        return problem(num);
    }
}