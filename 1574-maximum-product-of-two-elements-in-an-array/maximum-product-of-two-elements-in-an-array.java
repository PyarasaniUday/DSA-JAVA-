class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0; i < n; i++){
            for(int j=i + 1;j<n;j++){
                int pro=(nums[i] - 1) * (nums[j] - 1);

                if(pro>max){
                    max=pro;
                }
            }
        }

        return max;
    }
}