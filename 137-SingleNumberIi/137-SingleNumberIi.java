// Last updated: 2/2/2026, 2:34:41 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (int n : nums) {

            twos |= (ones & n);
            ones ^= n;
            int common_bits = (ones & twos);
            ones &= ~common_bits;
            twos &= ~common_bits;
        }

        // The number remaining in 'ones' is the single number that appeared only once.
        return ones;
    }
}
