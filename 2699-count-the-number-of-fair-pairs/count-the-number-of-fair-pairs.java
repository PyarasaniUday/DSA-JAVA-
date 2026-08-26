/*class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (lower <= nums[i] + nums[j]  && nums[i] + nums[j] <= upper) {
                    count++;
                }
            }
        }
        return count;
    }
}
*/
import java.util.*;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {

        Arrays.sort(nums);

        return count(nums, upper) - count(nums, lower - 1);
    }

    public long count(int[] nums, int target) {

        long ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            int low = left;
            int high = right + 1;

            while (low < high) {

                int mid = low + (high - low) / 2;

                if (nums[mid] <= target - nums[i]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            ans += low - left;
        }

        return ans;
    }
}