// Last updated: 2/2/2026, 2:34:35 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // 🔹 handle large k

        int[] dummy = new int[n];
        int index = 0;

        // take last k elements
        for (int i = n - k; i < n; i++) {
            dummy[index++] = nums[i];
        }

        // take first n-k elements
        for (int i = 0; i < n - k; i++) {
            dummy[index++] = nums[i];
        }

        // 🔹 copy back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = dummy[i];
        }
    }
}
