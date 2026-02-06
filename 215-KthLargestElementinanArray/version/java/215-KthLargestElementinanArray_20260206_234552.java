// Last updated: 2/6/2026, 11:45:52 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
4        for(int i = 0; i <  nums.length; i++){
5            if(minHeap.size() < k){
6                minHeap.add(nums[i]);
7            }else if(nums[i] > minHeap.peek()){
8                minHeap.poll();
9                minHeap.add(nums[i]);
10            }
11        }
12        return minHeap.peek();
13    }
14}