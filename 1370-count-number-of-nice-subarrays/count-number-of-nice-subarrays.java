/*class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int odd = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 != 0) {
                    odd++;
                }
                if (odd == k) {
                    ans++;
                }
                if (odd > k) {
                    break;
                }
            }
        }
        return ans;
    }
}
*/

//sliding win variable size
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) {
                count++;
            }

            while (count > k) {
                if (nums[left] % 2 != 0) {
                    count--;
                }
                left++;
            }

            ans = ans + (right - left + 1);
        }

        return ans;
    }
}