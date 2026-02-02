// Last updated: 2/2/2026, 2:34:19 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        if((n & (n - 1) )== 0){
            int count = 0;
            while((n&1) != 1){
                n = n>>1;
                count++;
            }
            if(count%2 == 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
}

// class Solution {
//     public boolean isPowerOfFour(int n) {
//         return (n > 0) && ((n & (n - 1)) == 0) && ((n & 0xAAAAAAAA) == 0);
//     }
// }

    /**
     * Checks if a given integer is a power of four.
     * A number n is a power of four if:
     * 1. It is positive (n > 0).
     * 2. It is a power of two (only one bit is set: (n & (n - 1)) == 0).
     * 3. The single set bit is in an even position (0, 2, 4, ...), 
     *    which means it doesn't overlap with the odd-position mask (0xAAAAAAAA).
     */