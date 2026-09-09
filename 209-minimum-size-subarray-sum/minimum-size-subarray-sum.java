class Solution {
    public int minSubArrayLen(int target, int[] nums){
        int left = 0;
        int sum = 0;
        int min = nums.length + 1;
        for(int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];
            while(sum >= target) {
                int len = right - left + 1;
                if(len < min) {
                    min = len;
                }
                sum = sum - nums[left];
                left++;
            }
        }
        if(min == nums.length + 1) {
            return 0;
        }
        return min;
    }
}
/*
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += nums[j];

                if (sum >= target) {
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
*/