// Last updated: 2/2/2026, 2:34:51 PM
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending with 0 but not 0 itself are not palindromes
        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            // Take the last digit and build reversedHalf
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // For even length numbers: x == reversedHalf
        // For odd length numbers: x == reversedHalf/10 (middle digit ignored)
        return (x == reversedHalf || x == reversedHalf / 10);
    }
}