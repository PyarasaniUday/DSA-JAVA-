/*
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i]==nums[j] && j-i<=k) {
                    return true;
                }
            }
        }
        return false;
    }
}
*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (k == 0) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {

            if (set.contains(nums[right])) {
                return true;
            }

            set.add(nums[right]);

            if (right >= k) {
                set.remove(nums[right - k]);
            }
        }

        return false;
    }
}
