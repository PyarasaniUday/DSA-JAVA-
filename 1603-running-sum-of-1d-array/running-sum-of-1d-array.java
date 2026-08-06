/*class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        result[0] = nums[0];  
        
        for(int i = 1; i < n; i++){
            result[i] = result[i - 1] + nums[i];
        }
        
        return result;
    }
}
*/

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
