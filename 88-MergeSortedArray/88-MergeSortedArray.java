// Last updated: 2/2/2026, 2:34:45 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 1) {
    
            nums1[0] = nums2[0];
        } else if (n != 0) {
            int j = 0;
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j++];
            }
            Arrays.sort(nums1);
        }
    }
}