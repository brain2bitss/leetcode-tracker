// Last updated: 2/2/2026, 2:34:49 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                nums[k] = nums[i]; 
                k++;
            }
        }
        return k;
    }
}
