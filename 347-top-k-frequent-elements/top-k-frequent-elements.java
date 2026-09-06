/*class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Set<Integer> s = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int[] arr = new int[k];
        Iterator<Integer> it = s.iterator();
        for(int i=0;i<k;i++){
            arr[i] = it.next();
        }
        return arr;
    }
}
*/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Add all unique numbers
        for (int n : map.keySet()) {
            pq.add(n);
        }

        // Take top k
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}
