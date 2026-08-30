class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p=p*nums[j];

                if(p>res){
                    res=p;
                }
            }
        }
        return res;
    }
}