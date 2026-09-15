//sliding win fixed size 
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[k-1]-nums[0];
        for(int i=k;i<nums.length;i++){
            int diff=nums[i]-nums[i-k+1];
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }
}