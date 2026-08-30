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
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            product = product * nums[right];

            while (product >= k) {
                product = product / nums[left];
                left++;
            }

            count = count + (right - left + 1);
        }

        return count;
    }
}