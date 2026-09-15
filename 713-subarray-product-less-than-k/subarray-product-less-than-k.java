/*class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p=p*nums[j];

                if(p<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}

*/

//sliding window 
//var win
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int l=0;
        int p=1;
        int c=0;

        for (int r=0;r<nums.length;r++){
            p=p*nums[r];

            while(p>=k){
                p=p/nums[l];
                l++;
            }

            c=c+(r-l+1);
        }
        return c;
    }
}
