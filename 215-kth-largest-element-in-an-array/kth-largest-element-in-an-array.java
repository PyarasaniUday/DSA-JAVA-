/*class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int result=nums[n-k];
        return result;
    }
}
*/

import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Max Heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        // Remove largest k-1 elements
        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        // Kth largest
        return pq.peek();
    }
}