// Last updated: 2/2/2026, 2:34:26 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Iterate through the array elements
        for (int val : nums) {
          
            // Add current element to the min heap
            pq.add(val);
            // If heap exceeds size K, remove smallest element
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
        
    }
}